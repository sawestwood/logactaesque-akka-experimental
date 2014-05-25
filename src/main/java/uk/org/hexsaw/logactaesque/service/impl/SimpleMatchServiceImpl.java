package uk.org.hexsaw.logactaesque.service.impl;

import uk.org.hexsaw.logactaesque.model.Fixture;
import uk.org.hexsaw.logactaesque.model.FixtureResult;
import uk.org.hexsaw.logactaesque.service.MatchService;
import uk.org.hexsaw.logactaesque.service.dice.Rollable;
import uk.org.hexsaw.logactaesque.service.dice.impl.SevenSidedDiceWithZero;


public class SimpleMatchServiceImpl implements MatchService {
    
    private static Rollable DICE = new SevenSidedDiceWithZero();

    public FixtureResult playFixture(Fixture fixture) {
    
        FixtureResult fixtureResult = new FixtureResult(fixture);
        fixtureResult.setHomeGoals(DICE.roll());
        fixtureResult.setAwayGoals(DICE.roll());
        return fixtureResult;
    }

}
