package java11;

import java.util.Random;

public class Team {
    private boolean status(){
        return new Random().nextBoolean();
    }
    private String name;
    private String[] players;

    public Team(String name, String[] players){
        this.name=name;
        this.players= players;
    }
    public boolean getStatus(){
        return status();
    }

    public String[] getPlayers(){
        return players;
    }
    public void showStatus(){
        int i;
        for (i=0;i<= players.length-1;i++){
            if (status()){
                System.out.println(players[i] + " Winner");
            }
            else {
                System.out.println(players[i] + " Loser");
            }
        }
    }



}

