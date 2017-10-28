package lab.serialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class GsonSerialization {

    public static ArrayList<String> serialize(ArrayList<TVShow> tvShows) {
        Metrics.start();
        ArrayList<String> json = new ArrayList<>();
        System.out.println("\n======GSON SERIALIZATION=====");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        for (TVShow show : tvShows) {
            String jsonShow = gson.toJson(show);
            json.add(jsonShow);
            System.out.println("TV Show #" + (tvShows.indexOf(show)+1));
            System.out.println(jsonShow);
        }

        Metrics.stop();
        System.out.println("\n=====GSON SERIALIZATION METRICS=====");
        Metrics.getExecutionTime();
        Metrics.getUsedMemory();
        return json;
    }

    public static ArrayList<TVShow> deserialize(ArrayList<String> jsonTvShows) {
        Metrics.start();
        System.out.println("\n======GSON DESERIALIZATION=====");
        ArrayList<TVShow> tvShows = new ArrayList<>();
        Gson gson = new Gson();
        for (String json : jsonTvShows) {
            TVShow tvShow = gson.fromJson(json, TVShow.class);
            tvShows.add(tvShow);
        }
        Lab5.printTvShow(tvShows);
        Metrics.stop();

        System.out.println("\n=====GSON DESERIALIZATION METRICS=====");
        Metrics.getExecutionTime();
        Metrics.getUsedMemory();
        System.out.println();
        return tvShows;
    }
}
