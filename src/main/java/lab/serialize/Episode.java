package lab.serialize;

public class Episode {
    private int episodeId;
    private String episodeTitle;
    private String episodeDescription;
    private String episodeDirector;

    public Episode() {
    }

    public Episode(int id, String title, String description, String director) {
        episodeId = id;
        episodeTitle = title;
        episodeDirector = director;
        episodeDescription = description;
    }

    public void setEpisodeId(int id){
        episodeId = id;
    }

    public int getEpisodeId(){
        return episodeId;
    }

    public void setEpisodeTitle(String title){
        episodeTitle = title;
    }

    public String getEpisodeTitle(){
        return episodeTitle;
    }

    public void setEpisodeDescription(String description){
        episodeDescription = description;
    }

    public String getEpisodeDescription(){
        return episodeDescription;
    }

    public void setEpisodeDirector(String director){
        episodeDirector = director;
    }

    public String getEpisodeDirector(){
        return episodeDirector;
    }
}
