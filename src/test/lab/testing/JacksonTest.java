package lab.testing;

import lab.serialize.*;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class JacksonTest {

    private ArrayList<TVShow> tvShows = Lab5.createTVShows();

    @Test
    public void serialize(){
        assertNotNull(JacksonSerialization.serialize(tvShows));
    }

    @Test
    public void deserialize(){
        assertNotEquals(JacksonSerialization.serialize(tvShows),
                JacksonSerialization.deserialize(JacksonSerialization.serialize(tvShows)));
    }
}
