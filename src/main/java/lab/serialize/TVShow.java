package lab.serialize;

import java.util.*;

public class TVShow {
    private String name;
    private int year;
    private String country;
    private String description;
    private Production production;
    private Map<Integer,Season> seasons = new HashMap<>();

    public TVShow(){}

    public TVShow(String _name, int _year,String _country, String _description){
        name=_name;
        year=_year;
        country=_country;
        description=_description;
    }

    public void addSeason(Season season){
        seasons.put(season.getSeasonId(),season);
    }

    public void setName(String _name){
        name=_name;
    }

    public String getName(){
        return name;
    }

    public void setYear(int _year){
        year=_year;
    }

    public int getYear(){
        return year;
    }

    public void setCountry(String _country){
        country=_country;
    }

    public String getCountry(){
        return country;
    }

    public void setDescription(String _description) {
        description = _description;
    }

    public String getDescription() {
        return description;
    }

    public void setProduction(Production _production){
        production=_production;
    }

    public Production getProduction() {
        return production;
    }

    public void setSeasons(Map<Integer, Season> _seasons) {
        seasons = _seasons;
    }

    public Map<Integer, Season> getSeasons() {
        return seasons;
    }
}
