package lab.testing;

import org.junit.Test;
import lab.serialize.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SeasonTest {

    @Test
    public void setSeasonId() throws NoSuchFieldException, IllegalAccessException {
        final Season season = new Season();
        int id = 1;
        season.setSeasonId(id);
        final Field field = season.getClass().getDeclaredField("seasonId");
        field.setAccessible(true);
        assertEquals(field.get(season), id);
    }

    @Test
    public void getSeasonId() throws NoSuchFieldException, IllegalAccessException {
        final Season season = new Season();
        final Field field = season.getClass().getDeclaredField("seasonId");
        field.setAccessible(true);
        int id = 1;
        field.set(season, id);
        assertEquals(id, season.getSeasonId());
    }

    @Test
    public void setEpisodeNumber() throws NoSuchFieldException, IllegalAccessException {
        final Season season = new Season();
        int number = 12;
        season.setEpisodeNumber(number);
        final Field field = season.getClass().getDeclaredField("episodeNumber");
        field.setAccessible(true);
        assertEquals(field.get(season), number);
    }

    @Test
    public void getEpisodeNumber() throws NoSuchFieldException, IllegalAccessException {
        final Season season = new Season();
        final Field field = season.getClass().getDeclaredField("episodeNumber");
        field.setAccessible(true);
        int number = 12;
        field.set(season, number);
        assertEquals(number, season.getEpisodeNumber());
    }

    @Test
    public void setSeasonDescription() throws NoSuchFieldException, IllegalAccessException {
        final Season season = new Season();
        String description = "Teen Wolf season description";
        season.setSeasonDescription(description);
        final Field field = season.getClass().getDeclaredField("seasonDescription");
        field.setAccessible(true);
        assertEquals(field.get(season), description);
    }

    @Test
    public void getSeasonDescription() throws NoSuchFieldException, IllegalAccessException {
        final Season season = new Season();
        final Field field = season.getClass().getDeclaredField("seasonDescription");
        field.setAccessible(true);
        String description = "Teen Wolf season description";
        field.set(season, description);
        assertEquals(description, season.getSeasonDescription());
    }

    @Test
    public void getEpisodes() throws NoSuchFieldException, IllegalAccessException {
        final Season season = new Season();
        final Field field = season.getClass().getDeclaredField("episodes");
        field.setAccessible(true);
        Map<Integer, Episode> episodes = new HashMap<>();
        episodes.put(2, new Episode(2, "Episode title", "Episode description",
                "Episode director"));
        field.set(season, episodes);
        assertEquals(episodes, season.getEpisodes());
    }

    @Test
    public void setEpisodes() throws NoSuchFieldException, IllegalAccessException {
        final Season season = new Season();
        Map<Integer, Episode> episodes = new HashMap<>();
        episodes.put(1, new Episode(1, "Episode title", "Episode description",
                "Episode director"));
        season.setEpisodes(episodes);
        final Field field = season.getClass().getDeclaredField("episodes");
        field.setAccessible(true);
        assertEquals(field.get(season), episodes);
    }
}
