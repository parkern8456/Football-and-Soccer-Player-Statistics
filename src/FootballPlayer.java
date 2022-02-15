// Nathan Parker
// Lab 10 - Searching An Arraylist
// 11/30/21

import java.text.DecimalFormat;

public class FootballPlayer extends Player{
    
    // Class Attributes.
    private int yards;
    private int minutesPlayed;
    private String pattern = "#.00";
    DecimalFormat numberFormat = new DecimalFormat(pattern);
    
    public FootballPlayer(){
        super();
        setYards(0);
        setMinutesPlayed(0);
    }
    
    public FootballPlayer(String name, Address address, int numIn, String sportsIn, int gamesPlayedIn, int yardsIn, int minutesPlayedIn){
        super(name, address, numIn, sportsIn, gamesPlayedIn);
        setYards(yardsIn);
        setMinutesPlayed(minutesPlayedIn);
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nFootball Player{Yards=" + getYards() + ", Minutes Played=" 
                + getMinutesPlayed() + ", Ratings=" + numberFormat.format(getRatings()) 
                + "}\n" + "============================================";
    }
    
    public int getYards(){
        return yards;
    }
    
    public void setYards(int yardsIn){
        yards = yardsIn;
    }
    
    public int getMinutesPlayed(){
        return minutesPlayed;
    }
    
    public void setMinutesPlayed(int minutesPlayedIn){
        minutesPlayed = minutesPlayedIn;
    }
    
    @Override
    public double getRatings(){
        // If Yards or GamesPlayed equals 0, return 0 to avoid division by 0.
        if ((getYards() == 0) || (getGamesPlayed() == 0)){
            return 0.00;
        }else{
            return (double)(getYards() - (getMinutesPlayed() / 10.0)) / getGamesPlayed();
        }
    }
}
