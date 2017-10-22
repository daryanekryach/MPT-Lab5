package lab.testing;

import org.junit.Test;
import lab.serialize.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TVShowTest {

    @Test
    public void setName() {
        TVShow show = new TVShow();
        String name = "Teen Wolf";
        show.setName(name);
        assertEquals(show.getName(), name);
    }

    @Test
    public void getName() {
        TVShow show = new TVShow();
        String name = "Teen Wolf";
        show.setName(name);
        assertEquals(name, show.getName());
    }

    @Test
    public void setYear() {
        TVShow show = new TVShow();
        int year = 2011;
        show.setYear(year);
        assertEquals(year, show.getYear());
    }

    @Test
    public void getYear() {
        TVShow show = new TVShow();
        int year = 2011;
        show.setYear(year);
        assertEquals(year, show.getYear());
    }

    @Test
    public void setCountry() {
        TVShow show = new TVShow();
        String country = "USA";
        show.setCountry(country);
        assertEquals(show.getCountry(), country);
    }

    @Test
    public void getCountry() {
        TVShow show = new TVShow();
        String country = "USA";
        show.setCountry(country);
        assertEquals(country, show.getCountry());
    }

    @Test
    public void setDescription() {
        TVShow show = new TVShow();
        String description = "Teen Wolf description";
        show.setDescription(description);
        assertEquals(show.getDescription(), description);
    }

    @Test
    public void getDescription() {
        TVShow show = new TVShow();
        String description = "Teen Wolf description";
        show.setDescription(description);
        assertEquals(description, show.getDescription());
    }

    @Test
    public void setProduction() {
        TVShow show = new TVShow();
        Production production = new Production();
        production.addExecutiveProducer("Executive Producer ");
        production.addProducer("Producer ");
        production.addLocation("Location ");
        production.addDistributor("Distributor ");
        show.setProduction(production);
        assertEquals(show.getProduction(), production);
    }

    @Test
    public void getProduction() {
        TVShow show = new TVShow();
        Production production = new Production();
        production.addExecutiveProducer("Executive Producer");
        production.addProducer("Producer ");
        production.addLocation("Location");
        production.addDistributor("Distributor");
        show.setProduction(production);
        assertEquals(production, show.getProduction());
    }

    @Test
    public void setSeasons() {
        TVShow show = new TVShow();
        ArrayList<Season> seasons = new ArrayList<>();
        seasons.add(new Season(1, 13, "Description"));
        show.setSeasons(seasons);
        assertEquals(show.getSeasons(), seasons);
    }

    @Test
    public void getSeasons() {
        TVShow show = new TVShow();
        ArrayList<Season> seasons = new ArrayList<>();
        seasons.add(new Season(1, 13, "Description "));
        show.setSeasons(seasons);
        assertEquals(seasons, show.getSeasons());
    }

    @Test
    public void addProduction() {
        TVShow show = new TVShow();
        Production production = new Production();
        production.addExecutiveProducer("Executive Producer ");
        production.addProducer("Producer ");
        production.addLocation("Location");
        production.addDistributor("Distributor");
        show.setProduction(production);
        assertEquals(production, show.getProduction());
    }

    @Test
    public void addSeason() {
        TVShow show = new TVShow();
        ArrayList<Season> seasons = new ArrayList<>();
        seasons.add(new Season(1, 13, "Description"));
        show.setSeasons(seasons);
        Season testSeason = new Season(2, 13, "Description 2");
        show.addSeason(testSeason);
        assertEquals(show.getSeasons().get(1), testSeason);
    }


}
