package lab.testing;
import org.junit.*;
import static org.junit.Assert.*;
import lab.serialize.*;

import java.util.ArrayList;
public class OrgJsonTest {

    private ArrayList<TVShow> tvShows = Lab5.createTVShows();

    @Test
    public void serialize(){
        assertNotNull(OrgJSONSerialization.serialize(tvShows));
    }

    @Test
    public void deserialize(){
        assertNotEquals(OrgJSONSerialization.serialize(tvShows),
                OrgJSONSerialization.deserialize(OrgJSONSerialization.serialize(tvShows)));
    }
}
