package lab.serialize;
import java.util.*;

public class Production {
    private ArrayList<String> executiveProducer = new ArrayList<>();
    private ArrayList<String> producer= new ArrayList<>();
    private ArrayList<String> location= new ArrayList<>();
    private ArrayList<String> distributor= new ArrayList<>();

    public void addExecutiveProducer(String producer){
        executiveProducer.add(producer);
    }

    public void addProducer(String _producer){
        producer.add(_producer);
    }

    public void addLocation(String _location){
        location.add(_location);
    }

    public void addDistributor(String _distributor){
        distributor.add(_distributor);
    }

    public void setProducer(ArrayList<String> producer) {
        this.producer = producer;
    }

    public ArrayList<String> getProducer() {
        return producer;
    }

    public void setDistributor(ArrayList<String> distributor) {
        this.distributor = distributor;
    }

    public ArrayList<String> getDistributor() {
        return distributor;
    }

    public void setExecutiveProducer(ArrayList<String> executiveProducer) {
        this.executiveProducer = executiveProducer;
    }

    public ArrayList<String> getExecutiveProducer() {
        return executiveProducer;
    }

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public ArrayList<String> getLocation() {
        return location;
    }
}

