package lab.serialize;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OrgJSONSerialization {

    public static ArrayList<String> serialize(ArrayList<TVShow> tvShows) {
        Metrics.start();
        ArrayList<String> json = new ArrayList<>();

        System.out.println("\n=====Org.JSON SERIALIZATION=====");

        for (TVShow show : tvShows) {
            JSONObject object = new JSONObject(show);
            String jsonShow = object.toString(4);
            json.add(jsonShow);
            System.out.println("TV Show #" + (tvShows.indexOf(show) + 1));
            System.out.println(jsonShow);
        }

        Metrics.stop();
        System.out.println("\n=====Org.JSON SERIALIZATION METRICS=====");
        Metrics.getExecutionTime();
        Metrics.getUsedMemory();
        return json;
    }

    public static ArrayList<TVShow> deserialize(ArrayList<String> jsonTvShows) {
        Metrics.start();
        ArrayList<TVShow> tvShows = new ArrayList<>();
        for (String json : jsonTvShows) {
            JSONObject object = new JSONObject(json);
            String name = object.getString("name");
            int year = object.getInt("year");
            String country = object.getString("country");
            String description = object.getString("description");
            TVShow tvShow = new TVShow(name, year, country, description);
            tvShow.setProduction(parseProductionJSON(object));
            tvShow.setSeasons(parseSeasonJSON(object));
            tvShows.add(tvShow);
        }
        Lab5.printTvShow(tvShows);
        Metrics.stop();

        System.out.println("\n=====Org.JSON DESERIALIZATION METRICS=====");
        Metrics.getExecutionTime();
        Metrics.getUsedMemory();
        System.out.println();
        return tvShows;
    }

    private static Production parseProductionJSON(JSONObject object) {
        JSONObject productionJson = object.getJSONObject("production");
        Production production = new Production();
        JSONArray exProducer = productionJson.getJSONArray("executiveProducer");
        JSONArray producer = productionJson.getJSONArray("producer");
        JSONArray location = productionJson.getJSONArray("location");
        JSONArray distributor = productionJson.getJSONArray("distributor");
        for (int i = 0; i < exProducer.length(); i++)
            production.addExecutiveProducer(exProducer.getString(i));
        for (int i = 0; i < producer.length(); i++)
            production.addProducer(producer.getString(i));
        for (int i = 0; i < location.length(); i++)
            production.addLocation(location.getString(i));
        for (int i = 0; i < exProducer.length(); i++)
            production.addDistributor(distributor.getString(i));
        return production;
    }

    private static Map<Integer,Season> parseSeasonJSON(JSONObject object) {
        JSONObject seasonJson = object.getJSONObject("seasons");
        Map<Integer,Season> seasons = new HashMap<>();
        Season season = new Season();
        for( int i=0; i<seasonJson.length(); i++){
            JSONObject seasonObj = seasonJson.getJSONObject(""+(i+1));
            season.setSeasonId((int)(seasonObj.toMap().get("seasonId")));
            season.setEpisodeNumber((int)(seasonObj.toMap().get("episodeNumber")));
            season.setSeasonDescription((String)(seasonObj.toMap().get("seasonDescription")));
            season.setEpisodes(parseEpisodeJSON(((HashMap)(seasonObj.toMap().get("episodes")))));
            seasons.put(season.getSeasonId(),season);
        }
        return seasons;
    }

    private static  Map<Integer,Episode> parseEpisodeJSON(HashMap hashMap) {
        Map<Integer,Episode> episodes =  new HashMap<>();
        Iterator entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            Episode episode = new Episode();
            Map.Entry entry = (Map.Entry) entries.next();
            Object episodeData = entry.getValue();
            episode.setEpisodeId((int)((HashMap)episodeData).get("episodeId"));
            episode.setEpisodeTitle((String)((HashMap)episodeData).get("episodeTitle"));
            episode.setEpisodeDescription((String)((HashMap)episodeData).get("episodeDescription"));
            episode.setEpisodeDirector((String)((HashMap)episodeData).get("episodeDirector"));
            episodes.put(episode.getEpisodeId(),episode);
            hashMap.entrySet().toArray();
        }
        return episodes;
    }
}
