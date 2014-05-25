package uk.org.hexsaw.logactaesque.engine.impl;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.org.hexsaw.logactaesque.model.Fixture;


public class BasicMatchEngineImplTest {

    private BasicMatchEngineImpl matchEngine;

    @Before
    public void setUp() throws Exception {
        matchEngine = new BasicMatchEngineImpl();
    }

    @Test
    public void canPlayAMatch() {
        Fixture fixture = null;
        assertThat(matchEngine.playFixture(fixture), notNullValue());
    }

}
