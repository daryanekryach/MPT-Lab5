package lab.testing;

import org.junit.*;

import static org.junit.Assert.*;

import lab.serialize.*;

import java.util.ArrayList;

public class ProductionTest {

    @Test
    public void setProducer() {
        Production production = new Production();
        ArrayList<String> producers = new ArrayList<>();
        producers.add("Producers");
        production.setProducer(producers);
        assertEquals(production.getProducer(), producers);
    }

    @Test
    public void getProducer() {
        Production production = new Production();
        ArrayList<String> producers = new ArrayList<>();
        producers.add("Producer ");
        production.setProducer(producers);
        assertEquals(producers, production.getProducer());
    }

    @Test
    public void setDistributor() {
        Production production = new Production();
        ArrayList<String> distributors = new ArrayList<>();
        distributors.add("Distributors");
        production.setDistributor(distributors);
        assertEquals(production.getDistributor(), distributors);
    }

    @Test
    public void getDistributor() {
        Production production = new Production();
        ArrayList<String> distributors = new ArrayList<>();
        distributors.add("Distributor");
        production.setDistributor(distributors);
        assertEquals(distributors, production.getDistributor());
    }

    @Test
    public void setExecutiveProducer() {
        Production production = new Production();
        ArrayList<String> exProducers = new ArrayList<>();
        exProducers.add("Executive Producers");
        production.setExecutiveProducer(exProducers);
        assertEquals(production.getExecutiveProducer(), exProducers);
    }

    @Test
    public void getExecutiveProducer() {
        Production production = new Production();
        ArrayList<String> exProducers = new ArrayList<>();
        exProducers.add("Executive Producers ");
        production.setExecutiveProducer(exProducers);
        assertEquals(exProducers, production.getExecutiveProducer());
    }

    @Test
    public void setLocation() {
        Production production = new Production();
        ArrayList<String> locations = new ArrayList<>();
        locations.add("Locations");
        production.setLocation(locations);
        assertEquals(production.getLocation(), locations);
    }

    @Test
    public void getLocation() {
        Production production = new Production();
        ArrayList<String> locations = new ArrayList<>();
        locations.add("Location");
        production.setLocation(locations);
        assertEquals(locations, production.getLocation());
    }
}
