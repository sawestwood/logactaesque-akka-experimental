package uk.org.hexsaw.logactaesque.service;

import uk.org.hexsaw.logactaesque.model.Fixture;
import uk.org.hexsaw.logactaesque.model.FixtureResult;


public interface MatchService {

    FixtureResult playFixture(Fixture fixture);

}
