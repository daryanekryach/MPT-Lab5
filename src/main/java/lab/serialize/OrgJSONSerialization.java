package lab.serialize;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class OrgJSONSerialization {

    public static ArrayList<String> serialize(ArrayList<TVShow> tvShows) {
        Metrics.start();
        ArrayList<String> json = new ArrayList<>();

        System.out.println("\n=====Org.JSON SERIALIZATION=====");

        for (TVShow show : tvShows) {
            JSONObject object = new JSONObject(show);
            String jsonShow = object.toString();
            json.add(jsonShow);
            System.out.println("TV Show #" + (tvShows.indexOf(show) + 1));
            System.out.println(jsonShow);
        }

        Metrics.stop();
        System.out.println("\n=====Org.JSON SERIALIZATION METRICS=====");
        Metrics.getExecutionTime();
        Metrics.getUsedMemory();
        return json;//
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

    private static ArrayList<Season> parseSeasonJSON(JSONObject object) {
        JSONArray seasonJson = object.getJSONArray("seasons");
        ArrayList<Season> seasons = new ArrayList<>();
        Season season = new Season();
        for (int i = 0; i < seasonJson.length(); i++) {
            season.setSeasonId(seasonJson.getJSONObject(i).getInt("seasonId"));
            season.setEpisodeNumber(seasonJson.getJSONObject(i).getInt("episodeNumber"));
            season.setSeasonDescription(seasonJson.getJSONObject(i).getString("seasonDescription"));
            season.setEpisodes(parseEpisodeJSON(seasonJson));
            seasons.add(season);
        }
        return seasons;
    }

    private static ArrayList<Episode> parseEpisodeJSON(JSONArray object) {
        ArrayList<Episode> episodes = new ArrayList<>();
        for (int j = 0; j < object.length(); j++) {
            JSONArray episodeJson = object.getJSONObject(j).getJSONArray("episodes");
            Episode episode = new Episode();
            for (int i = 0; i < episodeJson.length(); i++) {
                episode.setEpisodeId(episodeJson.getJSONObject(i).getInt("episodeId"));
                episode.setEpisodeTitle(episodeJson.getJSONObject(i).getString("episodeTitle"));
                episode.setEpisodeDescription(episodeJson.getJSONObject(i).getString("episodeDescription"));
                episode.setEpisodeDirector(episodeJson.getJSONObject(i).getString("episodeDirector"));
                episodes.add(episode);
            }
        }
        return episodes;
    }
}
