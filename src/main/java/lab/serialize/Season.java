package lab.serialize;

import java.util.*;

public class Season {
    private int seasonId;
    private int episodeNumber;
    private String seasonDescription;
    private ArrayList<Episode> episodes = new ArrayList<>();

    public Season() {
    }

    public Season(int _id, int _episodeNumber, String description) {
        seasonId = _id;
        episodeNumber = _episodeNumber;
        seasonDescription = description;
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
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

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }
}
