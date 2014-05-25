package uk.org.hexsaw.logactaesque.engine.impl;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import uk.org.hexsaw.logactaesque.model.FakeFixture;
import uk.org.hexsaw.logactaesque.model.Fixture;
import uk.org.hexsaw.logactaesque.model.FixtureResult;


public class BasicMatchEngineImplTest {

    private BasicMatchEngineImpl matchEngine;
    
    private Fixture fixture = FakeFixture.WBA_v_MANUTD;

    @Before
    public void setUp() throws Exception {
        matchEngine = new BasicMatchEngineImpl();
    }

    @Test
    public void canPlayAMatchAndGetAResult() {
        FixtureResult fixtureResult = matchEngine.playFixture(fixture);
        assertThat(fixtureResult.getHomeGoals(), not(FixtureResult.NOT_KICKED_OFF));
        assertThat(fixtureResult.getAwayGoals(), not(FixtureResult.NOT_KICKED_OFF));
    }
    

}
