package uk.org.hexsaw.logactaesque.model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FixtureResultTest {

    private FixtureResult fixtureResult;

    @Before
    public void setUp() {
        fixtureResult = new FixtureResult(FakeFixture.WBA_v_MANUTD);
    }
    
    @Test
    public void thatFixturePassedToTheResultIsTheSameFixture() {
        assertThat(fixtureResult.getFixture(), sameInstance(FakeFixture.WBA_v_MANUTD));
    }
    

    @Test
    public void beforeKickOffHomeGoalsIsNotZero() {
        assertThat(fixtureResult.getHomeGoals(), equalTo(FixtureResult.NOT_KICKED_OFF));
    }

}
