package uk.org.hexsaw.logactaesque.engine.impl;

import uk.org.hexsaw.logactaesque.engine.MatchEngine;
import uk.org.hexsaw.logactaesque.model.Fixture;
import uk.org.hexsaw.logactaesque.model.impl.FixtureResult;


public class BasicMatchEngineImpl implements MatchEngine {

    public Object playFixture(Fixture fixture) {
        return new FixtureResult();
    }

}
