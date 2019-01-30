public class Main {

    public static void main(String[] args) {
//        Exercise 90.1: Class Team
//        Implement a class Team. At this stage team has only a name (String)
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());

//        Exercise 90.2: Player
//        Create a class Player with the instance variables for the player name and the amount of goals.
//        A player should have two constructors: one that initializes the name and an another that initializes the name and the amount of goals.
        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);

        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);

//        Exercise 90.3: Adding players to a team
//        Add to the class Team the following methods:
//        addPlayer, adds a player to the team
//        printPlayers, prints the players in the team
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        barcelona.printPlayers();

//        Exercise 90.4: The team maximum size and current size
//        Add to the class Team the methods
//        setMaxSize(int maxSize), sets the maximum number of players that the team can have
//        size, returns the number of players in the team

        Team barcelona = new Team("FC Barcelona");
        barcelona.setMaxSize(16);

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Number of players: " + barcelona.size());

//        Exercise 90.5: Goals of a team
//        Add to the class Team the method
//        goals, returns the total number of goals for all the players in the team
        System.out.println("Total goals: " + barcelona.goals());
    }
}
