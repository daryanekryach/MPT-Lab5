package lab.serialize;

import java.util.*;

public class Season {
    private int seasonId;
    private int episodeNumber;
    private String seasonDescription;
    private Map<Integer, Episode> episodes = new HashMap<>();

    public Season(){}

    public Season(int _id, int _episodeNumber, String description) {
        seasonId = _id;
        episodeNumber = _episodeNumber;
        seasonDescription = description;
    }

    public void addEpisode(Episode episode) {
        episodes.put(episode.getEpisodeId(),episode);
    }

    public void setSeasonId(int id) {
        seasonId = id;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setEpisodeNumber(int episodeCount) {
        episodeNumber = episodeCount;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setSeasonDescription(String description) {
        seasonDescription = description;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }

    public void setEpisodes(Map<Integer, Episode> _episodes) {
        episodes = _episodes;
    }

    public Map<Integer, Episode> getEpisodes() {
        return episodes;
    }
}
