package lab.testing;

import org.junit.*;

import static org.junit.Assert.*;

import lab.serialize.*;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ProductionTest {

    @Test
    public void setProducer() throws NoSuchFieldException, IllegalAccessException {
        final Production production = new Production();
        ArrayList<String> producers = new ArrayList<>();
        producers.add("Producers");
        production.setProducer(producers);
        final Field field = production.getClass().getDeclaredField("producer");
        field.setAccessible(true);
        assertEquals(field.get(production), producers);
    }

    @Test
    public void getProducer() throws NoSuchFieldException, IllegalAccessException {
        final Production production = new Production();
        final Field field = production.getClass().getDeclaredField("producer");
        field.setAccessible(true);
        ArrayList<String> producers = new ArrayList<>();
        producers.add("Producer ");
        field.set(production, producers);
        assertEquals(producers, production.getProducer());
    }

    @Test
    public void setDistributor() throws NoSuchFieldException, IllegalAccessException {
        final Production production = new Production();
        ArrayList<String> distributors = new ArrayList<>();
        distributors.add("Distributors");
        production.setDistributor(distributors);
        final Field field = production.getClass().getDeclaredField("distributor");
        field.setAccessible(true);
        assertEquals(field.get(production), distributors);
    }

    @Test
    public void getDistributor() throws NoSuchFieldException, IllegalAccessException {
        final Production production = new Production();
        final Field field = production.getClass().getDeclaredField("distributor");
        field.setAccessible(true);
        ArrayList<String> distributors = new ArrayList<>();
        distributors.add("Distributor");
        field.set(production, distributors);
        assertEquals(distributors, production.getDistributor());
    }

    @Test
    public void setExecutiveProducer() throws NoSuchFieldException, IllegalAccessException {
        final Production production = new Production();
        ArrayList<String> exProducers = new ArrayList<>();
        exProducers.add("Executive Producers");
        production.setExecutiveProducer(exProducers);
        final Field field = production.getClass().getDeclaredField("executiveProducer");
        field.setAccessible(true);
        assertEquals(field.get(production), exProducers);
    }

    @Test
    public void getExecutiveProducer() throws NoSuchFieldException, IllegalAccessException {
        final Production production = new Production();
        final Field field = production.getClass().getDeclaredField("executiveProducer");
        field.setAccessible(true);
        ArrayList<String> exProducers = new ArrayList<>();
        exProducers.add("Executive Producers ");
        field.set(production, exProducers);
        assertEquals(exProducers, production.getExecutiveProducer());
    }

    @Test
    public void setLocation() throws NoSuchFieldException, IllegalAccessException {
        final Production production = new Production();
        ArrayList<String> locations = new ArrayList<>();
        locations.add("Locations");
        production.setLocation(locations);
        final Field field = production.getClass().getDeclaredField("location");
        field.setAccessible(true);
        assertEquals(field.get(production), locations);
    }

    @Test
    public void getLocation() throws NoSuchFieldException, IllegalAccessException {
        final Production production = new Production();
        final Field field = production.getClass().getDeclaredField("location");
        field.setAccessible(true);
        ArrayList<String> locations = new ArrayList<>();
        locations.add("Location");
        field.set(production, locations);
        assertEquals(locations, production.getLocation());
    }
}
