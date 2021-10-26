package shafi;

public class Cricket extends Sports {
    String matchType;
    int over;
    String player;

    public Cricket(String matchType, int over, Player player) {
        this.matchType = matchType;
        this.over = over;
        this.player = player.playerName;
    }



    void display(){
        System.out.println("Match Type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of a player: "+player);

    }
}

 /*
    ***********************************
    Name: Md.Abidur Rahman Shafi
    ID:2012020121
    Section: C
    Email: cse_2012020121@lus.ac.bd
    Date: 11/09/2021
    ***********************************
    */