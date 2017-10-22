package lab.testing;
import org.junit.*;
import static org.junit.Assert.*;
import lab.serialize.*;

public class EpisodeTest {

    @Test
    public void setEpisodeId(){
        Episode episode = new Episode();
        int id = 1;
        episode.setEpisodeId(id);
        assertEquals(episode.getEpisodeId(),id);
    }

    @Test
    public void getEpisodeId(){
        Episode episode = new Episode();
        int id = 1;
        episode.setEpisodeId(id);
        assertEquals(id,episode.getEpisodeId());
    }

    @Test
    public void setEpisodeTitle(){
        Episode episode = new Episode();
        String title= "Teen Wolf episode name";
        episode.setEpisodeTitle(title);
        assertEquals(episode.getEpisodeTitle(),title);
    }

    @Test
    public void getEpisodeTitle(){
        Episode episode = new Episode();
        String title= "Teen Wolf episode name";
        episode.setEpisodeTitle(title);
        assertEquals(title,episode.getEpisodeTitle());
    }

    @Test
    public void setEpisodeDescription(){
        Episode episode = new Episode();
        String description= "Teen Wolf episode description";
        episode.setEpisodeDescription(description);
        assertEquals(episode.getEpisodeDescription(),description);
    }

    @Test
    public void getEpisodeDescription(){
        Episode episode = new Episode();
        String description= "Teen Wolf episode description";
        episode.setEpisodeDescription(description);
        assertEquals(description,episode.getEpisodeDescription());
    }

    @Test
    public void setEpisodeDirector(){
        Episode episode = new Episode();
        String director= "Teen Wolf episode director";
        episode.setEpisodeDirector(director);
        assertEquals(episode.getEpisodeDirector(),director);
    }

    @Test
    public void getEpisodeDirector(){
        Episode episode = new Episode();
        String director= "Teen Wolf episode director";
        episode.setEpisodeDirector(director);
        assertEquals(director,episode.getEpisodeDirector());
    }
}
