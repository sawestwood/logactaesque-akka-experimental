package uk.org.hexsaw.logactaesque.service.impl;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.org.hexsaw.logactaesque.model.FakeFixture;
import uk.org.hexsaw.logactaesque.model.Fixture;
import uk.org.hexsaw.logactaesque.model.FixtureResult;
import uk.org.hexsaw.logactaesque.service.impl.SimpleMatchServiceImpl;


public class SimpleMatchServiceImplTest {

    private SimpleMatchServiceImpl matchEngine;
    
    private Fixture fixture = FakeFixture.WBA_v_MANUTD;
    
    private static final Logger logger = LoggerFactory.getLogger(SimpleMatchServiceImpl.class);

    @Before
    public void setUp() throws Exception {
        matchEngine = new SimpleMatchServiceImpl();
    }

    @Test
    public void canPlayAMatchAndGetAResult() {
        FixtureResult fixtureResult = matchEngine.playFixture(fixture);
        logger.info(fixtureResult.toString());
        assertThat(fixtureResult.getHomeGoals(), not(FixtureResult.NOT_KICKED_OFF));
        assertThat(fixtureResult.getAwayGoals(), not(FixtureResult.NOT_KICKED_OFF));
    }
    

}
