package uk.org.hexsaw.logactaesque;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import uk.org.hexsaw.logactaesque.model.Fixture;
import uk.org.hexsaw.logactaesque.model.Team;


public class FixtureTest {
    
    private Fixture fixture = null;
    
    @Before 
    public void setUp() {
        fixture = new Fixture(new Team(), new Team());
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
