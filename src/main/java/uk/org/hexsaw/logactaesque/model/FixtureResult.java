package uk.org.hexsaw.logactaesque.model;

public class FixtureResult {

    private Fixture fixture;

    public static int NOT_KICKED_OFF = -1;

    private int homeGoals = NOT_KICKED_OFF;
    private int awayGoals = NOT_KICKED_OFF;

    public FixtureResult(Fixture fixture) {
        this.fixture = fixture;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }
    
    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }    
    
    @Override
    public String toString() {
        return String.format("FixtureResult [%s %s - %s %s]", fixture.getHomeTeam().getShortName(), homeGoals, awayGoals, fixture.getAwayTeam().getShortName());
    }

}
