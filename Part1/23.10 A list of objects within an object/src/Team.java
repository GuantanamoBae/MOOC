import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> team;
    private int max;
    private int size;
    private int goals;

    public Team(String name){
        this.name = name;
        this.team = new ArrayList<Player>();
        this.max = 16;
        this.size = 0;
        this.goals = 0;
    }

    public String getName(){
        return this.name;
    }

    public void addPlayer(Player noob){
        if(this.size < this.max) {
            this.size++;
            team.add(noob);
            this.goals += noob.goals();
        }
    }

    public void printPlayers(){
        for(Player i : team){
            System.out.println(i);
        }
    }

    public void setMaxSize(int maxSize){
        this.max = maxSize;
    }

    public int size(){
        return size;
    }

    public int goals(){
        return this.goals;
    }
}
