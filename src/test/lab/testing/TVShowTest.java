package lab.testing;

import org.junit.Test;
import lab.serialize.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TVShowTest {

    @Test
    public void setName()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        String name = "Teen Wolf";
        show.setName(name);
        final Field field = show.getClass().getDeclaredField("name");
        field.setAccessible(true);
        assertEquals(field.get(show), name);
    }

    @Test
    public void getName()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        final Field field = show.getClass().getDeclaredField("name");
        field.setAccessible(true);
        String name = "Teen Wolf";
        field.set(show, name);
        assertEquals(name, show.getName());
    }

    @Test
    public void setYear()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        int year = 2011;
        show.setYear(year);
        final Field field = show.getClass().getDeclaredField("year");
        field.setAccessible(true);
        assertEquals(year, field.get(show));
    }

    @Test
    public void getYear()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        final Field field = show.getClass().getDeclaredField("year");
        field.setAccessible(true);
        int year = 2011;
        field.set(show, year);
        assertEquals(year, show.getYear());
    }

    @Test
    public void setCountry()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        String country = "USA";
        show.setCountry(country);
        final Field field = show.getClass().getDeclaredField("country");
        field.setAccessible(true);
        assertEquals(field.get(show), country);
    }

    @Test
    public void getCountry()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        final Field field = show.getClass().getDeclaredField("country");
        field.setAccessible(true);
        String country = "USA";
        field.set(show, country);
        assertEquals(country, show.getCountry());
    }

    @Test
    public void setDescription()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        String description = "Teen Wolf description";
        show.setDescription(description);
        final Field field = show.getClass().getDeclaredField("description");
        field.setAccessible(true);
        assertEquals(field.get(show), description);
    }

    @Test
    public void getDescription()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        final Field field = show.getClass().getDeclaredField("description");
        field.setAccessible(true);
        String description = "Teen Wolf description";
        field.set(show, description);
        assertEquals(description, show.getDescription());
    }

    @Test
    public void setProduction()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        Production production = new Production();
        production.addExecutiveProducer("Executive Producer ");
        production.addProducer("Producer ");
        production.addLocation("Location ");
        production.addDistributor("Distributor ");
        show.setProduction(production);
        final Field field = show.getClass().getDeclaredField("production");
        field.setAccessible(true);
        assertEquals(field.get(show), production);
    }

    @Test
    public void getProduction() throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        final Field field = show.getClass().getDeclaredField("production");
        field.setAccessible(true);
        Production production = new Production();
        production.addExecutiveProducer("Executive Producer");
        production.addProducer("Producer ");
        production.addLocation("Location");
        production.addDistributor("Distributor");
        field.set(show, production);
        assertEquals(production, show.getProduction());
    }

    @Test
    public void setSeasons()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        Map<Integer,Season> seasons = new HashMap<>();
        seasons.put(1,new Season(1, 13, "Description"));
        show.setSeasons(seasons);
        final Field field = show.getClass().getDeclaredField("seasons");
        field.setAccessible(true);
        assertEquals(field.get(show), seasons);
    }

    @Test
    public void getSeasons()  throws NoSuchFieldException, IllegalAccessException {
        final TVShow show = new TVShow();
        final Field field = show.getClass().getDeclaredField("seasons");
        field.setAccessible(true);
        Map<Integer,Season> seasons = new HashMap<>();
        seasons.put(1,new Season(1, 13, "Description "));
        field.set(show, seasons);
        assertEquals(seasons, show.getSeasons());
    }

    @Test
    public void addSeason() {
        TVShow show = new TVShow();
        Map<Integer,Season> seasons = new HashMap<>();
        seasons.put(1,new Season(1, 13, "Description"));
        show.setSeasons(seasons);
        Season testSeason = new Season(2, 13, "Description 2");
        show.addSeason(testSeason);
        assertEquals(show.getSeasons().get(2), testSeason);
    }


}
