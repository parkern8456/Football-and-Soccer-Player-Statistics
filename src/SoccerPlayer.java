// Nathan Parker
// Lab 10 - Searching An Arraylist
// 11/30/21

public class SoccerPlayer extends Player{
    
    // Class Attributes.
    private int goals;
    private int yellowCards;
    
    public SoccerPlayer(){
        super();
        setGoals(0);
        setYellowCards(0);
    }
    
    public SoccerPlayer(String name, Address address, int numIn, String sportsIn, int gamesPlayedIn, int goalsIn, int yellowCardsIn){
        super(name, address, numIn, sportsIn, gamesPlayedIn);
        setGoals(goalsIn);
        setYellowCards(yellowCardsIn);
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nSoccer Player{Goals=" + getGoals() 
                + ", Yellow Cards=" + getYellowCards() + ", Ratings=" 
                + getRatings() + "}\n" + "============================================";
    }
    
    public int getGoals(){
        return goals;
    }
    
    public void setGoals(int goalsIn){
        goals = goalsIn;
    }
    
    public int getYellowCards(){
        return yellowCards;
    }
    
    public void setYellowCards(int yellowCardsIn){
        yellowCards = yellowCardsIn;
    }
    
    @Override
    public double getRatings(){
        // If Goals or GamesPlayed equals 0, return 0 to avoid division by 0.
        if ((getGoals() == 0) || (getGamesPlayed() == 0)){
            return 0.0;
        }else{
            return (double)(getGoals() - getYellowCards()) / getGamesPlayed();
        }
    }
}
