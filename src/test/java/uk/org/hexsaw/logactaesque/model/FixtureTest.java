package uk.org.hexsaw.logactaesque.model;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class FixtureTest {
    
    private Fixture fixture = null;
    
    @Before 
    public void setUp() {
        fixture = new Fixture(FakeTeam.TEAM_MAN_UTD, FakeTeam.TEAM_WBA);
    }

    @Test
    public void canCreateAFixture() {
        assertThat(fixture, notNullValue()); 
    }
    
    @Test
    public void mustHaveAHomeTeam() {
        assertThat(fixture.getHomeTeam(), notNullValue()); 
    }
    
    @Test
    public void mustHaveAnAwayTeam() {
        assertThat(fixture.getAwayTeam(), notNullValue()); 
    }    

}
