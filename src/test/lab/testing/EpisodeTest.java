package lab.testing;

import org.junit.*;

import static org.junit.Assert.*;

import lab.serialize.*;

import java.lang.reflect.Field;

public class EpisodeTest {

    @Test
    public void setEpisodeId() throws NoSuchFieldException, IllegalAccessException {
        final Episode episode = new Episode();
        int id = 1;
        episode.setEpisodeId(id);
        final Field field = episode.getClass().getDeclaredField("episodeId");
        field.setAccessible(true);
        assertEquals(field.get(episode), id);
    }

    @Test
    public void getEpisodeId() throws NoSuchFieldException, IllegalAccessException {
        final Episode episode = new Episode();
        final Field field = episode.getClass().getDeclaredField("episodeId");
        field.setAccessible(true);
        int id = 1;
        field.set(episode, id);
        assertEquals(episode.getEpisodeId(), id);
    }

    @Test
    public void setEpisodeTitle() throws NoSuchFieldException, IllegalAccessException {
        final Episode episode = new Episode();
        String title = "Teen Wolf episode name";
        episode.setEpisodeTitle(title);
        final Field field = episode.getClass().getDeclaredField("episodeTitle");
        field.setAccessible(true);
        assertEquals(field.get(episode), title);
    }

    @Test
    public void getEpisodeTitle() throws NoSuchFieldException, IllegalAccessException {
        final Episode episode = new Episode();
        final Field field = episode.getClass().getDeclaredField("episodeTitle");
        field.setAccessible(true);
        String title = "Teen Wolf episode name";
        field.set(episode, title);
        assertEquals(title, episode.getEpisodeTitle());
    }

    @Test
    public void setEpisodeDescription() throws NoSuchFieldException, IllegalAccessException {
        Episode episode = new Episode();
        String description = "Teen Wolf episode description";
        episode.setEpisodeDescription(description);
        final Field field = episode.getClass().getDeclaredField("episodeDescription");
        field.setAccessible(true);
        assertEquals(field.get(episode), description);
    }

    @Test
    public void getEpisodeDescription() throws NoSuchFieldException, IllegalAccessException {
        final Episode episode = new Episode();
        final Field field = episode.getClass().getDeclaredField("episodeDescription");
        field.setAccessible(true);
        String description = "Teen Wolf episode description";
        field.set(episode, description);
        assertEquals(description, episode.getEpisodeDescription());
    }

    @Test
    public void setEpisodeDirector() throws NoSuchFieldException, IllegalAccessException {
        final Episode episode = new Episode();
        String director = "Teen Wolf episode director";
        episode.setEpisodeDirector(director);
        final Field field = episode.getClass().getDeclaredField("episodeDirector");
        field.setAccessible(true);
        assertEquals(field.get(episode), director);
    }

    @Test
    public void getEpisodeDirector() throws NoSuchFieldException, IllegalAccessException {
        final Episode episode = new Episode();
        final Field field = episode.getClass().getDeclaredField("episodeDirector");
        field.setAccessible(true);
        String director = "Teen Wolf episode director";
        field.set(episode, director);
        assertEquals(director, episode.getEpisodeDirector());
    }
}
