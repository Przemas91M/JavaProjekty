public class Main {
    public static void main(String[] args) {
    League<BasketballTeam> basketballLeague = new League<>("NBA");
    League<SoccerTeam> soccerLeague = new League<>("MasterLeague");

    BasketballTeam chicagoBulls = new BasketballTeam("Chicago Bulls", 20);
    BasketballTeam redDragons = new BasketballTeam("Red dragons", 55);
    BasketballTeam blackWidow = new BasketballTeam("Black Widow", 30);

    SoccerTeam dortmung = new SoccerTeam("Borussia Dortmund", 33);
    SoccerTeam milano = new SoccerTeam("Cresia Milano", 5);
    SoccerTeam legia = new SoccerTeam("Legia Warszawa", 50);

    basketballLeague.addTeam(chicagoBulls);
    basketballLeague.addTeam(redDragons);
    basketballLeague.addTeam(blackWidow);
//    basketballLeague.addTeam(dortmung); - to nie zadziała, bo mamy różne typy drużyn.

    soccerLeague.addTeam(dortmung);
    soccerLeague.addTeam(milano);
    soccerLeague.addTeam(legia);
    soccerLeague.addTeam(legia);

    basketballLeague.printRanking();

    soccerLeague.printRanking();
    }
}
