package lab.serialize;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.ArrayList;

public class JacksonSerialization {

    public static ArrayList<String> serialize(ArrayList<TVShow> tvShows){
        Metrics.start();
        ArrayList<String> json = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("\n=====JACKSON SERIALIZATION=====");
        for (TVShow show : tvShows) {
            try {
                String jsonShow = mapper.writeValueAsString(show);
                mapper.enable(SerializationFeature.INDENT_OUTPUT);
                json.add(jsonShow);
                System.out.println("TV Show #" + (tvShows.indexOf(show) + 1));
                System.out.println(jsonShow);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }

        Metrics.stop();
        System.out.println("\n=====JACKSON SERIALIZATION METRICS=====");
        Metrics.getExecutionTime();
        Metrics.getUsedMemory();
        return json;
    }

    public static ArrayList<TVShow> deserialize(ArrayList<String> jsonTvShows){
        Metrics.start();
        ArrayList<TVShow> tvShows = new ArrayList<>();
        System.out.println("\n=====JACKSON DESERIALIZATION=====");
        ObjectMapper mapper = new ObjectMapper();

        for (String json : jsonTvShows) {
            TVShow tvShow = null;
            try {
                tvShow = mapper.readValue(json, TVShow.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            tvShows.add(tvShow);
        }
        Lab5.printTvShow(tvShows);
        Metrics.stop();

        System.out.println("\n=====JACKSON DESERIALIZATION METRICS=====");
        Metrics.getExecutionTime();
        Metrics.getUsedMemory();
        System.out.println();
        return tvShows;
    }
}
