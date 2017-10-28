package lab.testing;

import org.junit.Test;
import lab.serialize.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SeasonTest {

    @Test
    public void setSeasonId() {
        Season season = new Season();
        int id = 1;
        season.setSeasonId(id);
        assertEquals(season.getSeasonId(), id);
    }

    @Test
    public void getSeasonId() {
        Season season = new Season();
        int id = 1;
        season.setSeasonId(id);
        assertEquals(id, season.getSeasonId());
    }

    @Test
    public void setEpisodeNumber() {
        Season season = new Season();
        int number = 12;
        season.setEpisodeNumber(number);
        assertEquals(season.getEpisodeNumber(), number);
    }

    @Test
    public void getEpisodeNumber() {
        Season season = new Season();
        int number = 12;
        season.setEpisodeNumber(number);
        assertEquals(number, season.getEpisodeNumber());
    }

    @Test
    public void setSeasonDescription() {
        Season season = new Season();
        String description = "Teen Wolf season description";
        season.setSeasonDescription(description);
        assertEquals(season.getSeasonDescription(), description);
    }

    @Test
    public void getSeasonDescription() {
        Season season = new Season();
        String description = "Teen Wolf season description";
        season.setSeasonDescription(description);
        assertEquals(description, season.getSeasonDescription());
    }

    @Test
    public void getEpisodes() {
        Season season = new Season();
        Map<Integer, Episode> episodes = new HashMap<>();
        episodes.put(2,new Episode(2, "Episode title", "Episode description",
                "Episode director"));
        season.setEpisodes(episodes);
        assertEquals(episodes, season.getEpisodes());
    }

    @Test
    public void setEpisodes() {
        Season season = new Season();
        Map<Integer, Episode> episodes = new HashMap<>();
        episodes.put(1,new Episode(1, "Episode title", "Episode description",
                "Episode director"));
        season.setEpisodes(episodes);
        assertEquals(season.getEpisodes(), episodes);
    }
}
