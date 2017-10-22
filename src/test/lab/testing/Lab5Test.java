package lab.testing;

import lab.serialize.*;
import org.junit.*;

import static org.junit.Assert.*;
public class Lab5Test {

    @Test
    public void printTvShowsTest(){
        assertTrue(Lab5.printTvShow(GsonSerialization.deserialize(GsonSerialization.serialize(Lab5.createTVShows()))));
    }

}
