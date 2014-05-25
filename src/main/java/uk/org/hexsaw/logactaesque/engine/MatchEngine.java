package uk.org.hexsaw.logactaesque.engine;

import uk.org.hexsaw.logactaesque.model.Fixture;
import uk.org.hexsaw.logactaesque.model.FixtureResult;


public interface MatchEngine {

    FixtureResult playFixture(Fixture fixture);

}
