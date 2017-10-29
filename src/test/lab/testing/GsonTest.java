package lab.testing;
import org.junit.*;
import static org.junit.Assert.*;
import lab.serialize.*;

import java.util.ArrayList;

public class GsonTest {

    private ArrayList<TVShow> tvShows = Lab5.createTVShows();

    @Test
    public void serialize(){
        assertNotNull(GsonSerialization.serialize(tvShows));
    }

    @Test
    public void deserialize(){
        assertNotEquals(GsonSerialization.serialize(tvShows),
                GsonSerialization.deserialize(GsonSerialization.serialize(tvShows)));
    }
}
