import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> implements Comparable<Team>{
    private ArrayList<T> teams;
    private final String name;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(T team){
        if(teams.contains(team)){
            System.out.println("This team is already on this league!");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to league: " + this.name);
            return true;
        }
    }

    public void printRanking(){
        if(teams.size() > 0){
            Collections.sort(teams);
            System.out.println("Rankings in " + this.name + " league:");
            for (Team t: teams) {
                System.out.println(t.getName() + ":" + t.getScore() + " points.");
            }
        } else {
            System.out.println("There are no teams in this league");
        }

    }

    @Override
    public int compareTo(Team o) {
        return 0;
    }
}
