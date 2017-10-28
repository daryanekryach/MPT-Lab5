package lab.serialize;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;

public class Lab5 {
    public static void main(String[] args)  throws JsonMappingException, JsonGenerationException {
        ArrayList<TVShow> tvShows = createTVShows();
        gsonSerialize(tvShows);
        jacksonSerialize(tvShows);
        orgJsonSerialize(tvShows);
    }

    public static ArrayList<TVShow> createTVShows() {
        ArrayList<TVShow> tvShows = new ArrayList<>();
        TVShow teenWolf = new TVShow("Teen Wolf", 2011, "United States",
                "A somewhat awkward teen is attacked by a werewolf and inherits the curse himself " +
                        "as well as the enemies that come with it.");
        Production twProduction = new Production();
        twProduction.addExecutiveProducer("Jeff Davis");
        twProduction.addDistributor("Viacom Media Networks");
        twProduction.addLocation("Atlanta, Georgia");
        twProduction.addProducer("Eric Wallace");
        teenWolf.setProduction(twProduction);
        Season twFirstSeason = new Season(1, 12, "Scott McCall (Tyler Posey), is an " +
                "average teenager suffering from asthma and living with his single mother in Beacon Hills. One night, " +
                "he and his best friend Stiles Stilinski (Dylan O'Brien), the son of the local sheriff, Sheriff " +
                "Stilinski (Linden Ashby), learn about half a corpse found by police in the woods...");
        twFirstSeason.addEpisode(new Episode(1, "Wolf Moon", "Everything in Scott McCall's life is " +
                "starting to fall into place. He gets a spot on the First Line of his Lacrosse team and a date " +
                "with the woman of his dreams. When he gets bitten by a werewolf, the people around him " +
                "could be in danger.", "Russell Mulcahy"));
        teenWolf.addSeason(twFirstSeason);
        tvShows.add(teenWolf);

        TVShow dareDevil = new TVShow("Daredevil", 2015, "United States",
                "Marvel's Daredevil, or simply Daredevil, is an American web television series" +
                        " that stars the superhero character of the same name. It is produced by Marvel " +
                        "Television and airs on Netflix. It is set in the Marvel Cinematic Universe, and occurs " +
                        "sometime after the events of The Avengers.");
        Production ddProduction = new Production();
        ddProduction.addExecutiveProducer("Allie Goss");
        ddProduction.addDistributor("Netflix");
        ddProduction.addLocation("New York City");
        ddProduction.addProducer("Kati Johnston");
        dareDevil.setProduction(ddProduction);
        Season ddFirstSeason = new Season(1, 13,
                "Live action series that follows the journey of attorney Matt Murdock," +
                        " who in a tragic accident was blinded as a boy but imbued with extraordinary senses. " +
                        "Murdock sets up practice in his old neighborhood of Hell's Kitchen, New York where he now " +
                        "fights against injustice as a respected lawyer by day and masked vigilante at night.");
        ddFirstSeason.addEpisode(new Episode(1, "Into the Ring", "Murdock's vigilante crime" +
                " fighting and his new law practice find equally dangerous challenges in a murder case tied to a" +
                " corporate crime syndicate.", "Phil Abraham"));
        dareDevil.addSeason(ddFirstSeason);
        tvShows.add(dareDevil);

        return tvShows;
    }

    public static boolean printTvShow(ArrayList<TVShow> tvShows){
        for(TVShow show : tvShows){
            System.out.println("Name: " + show.getName());
            System.out.println("Year: " + show.getYear());
            System.out.println("Country: " + show.getCountry());
            System.out.println("Description: " + show.getDescription());
            System.out.println("PRODUCTION");
            System.out.print("Executive producer: ");
            for(String p : show.getProduction().getExecutiveProducer())
                System.out.print(p + " ");
            System.out.print("\nProducer: ");
            for(String p : show.getProduction().getProducer())
                System.out.print(p + " ");
            System.out.print("\nLocation: ");
            for(String l : show.getProduction().getLocation())
                System.out.print(l + " ");
            System.out.print("\nDistributor: ");
            for(String l : show.getProduction().getLocation())
                System.out.print(l + " ");
            System.out.println("SEASONS");
            for(Season s:show.getSeasons().values()){
                System.out.println("Season id: " + s.getSeasonId());
                System.out.println("Number of episodes: " + s.getEpisodeNumber());
                System.out.println("Season description: " + s.getSeasonDescription());
               for (Episode e : s.getEpisodes().values()){
                    System.out.println("Episode id: " + e.getEpisodeId());
                    System.out.println("Episode title: " + e.getEpisodeTitle());
                    System.out.println("Episode synopsis: " + e.getEpisodeDescription());
                    System.out.println("Episode director: " + e.getEpisodeDirector());
                }
            }
            System.out.println();
        }
        return true;
    }

    private static void gsonSerialize(ArrayList<TVShow> tvShows) {
        ArrayList<String> serializedShows = GsonSerialization.serialize(tvShows);
        GsonSerialization.deserialize(serializedShows);
    }

    private static void jacksonSerialize(ArrayList<TVShow> tvShows) throws JsonMappingException,
            JsonGenerationException {
        ArrayList<String> serializedShows = JacksonSerialization.serialize(tvShows);
        JacksonSerialization.deserialize(serializedShows);
    }

    private static void orgJsonSerialize(ArrayList<TVShow> tvShows) throws JsonMappingException,
            JsonGenerationException {
        ArrayList<String> serializedShows = OrgJSONSerialization.serialize(tvShows);
        OrgJSONSerialization.deserialize(serializedShows);
    }
}
