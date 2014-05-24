package uk.org.hexsaw.logactaesque.model;

public class Fixture {
    
    private Team homeTeam;
    private Team awayTeam;
  
    public Fixture(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() { 
        return this.homeTeam;
    }

    public Team getAwayTeam() {
        return this.awayTeam;
    }

}
