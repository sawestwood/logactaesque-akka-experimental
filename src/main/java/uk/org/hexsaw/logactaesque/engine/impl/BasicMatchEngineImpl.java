package uk.org.hexsaw.logactaesque.engine.impl;

import uk.org.hexsaw.logactaesque.engine.MatchEngine;
import uk.org.hexsaw.logactaesque.engine.dice.Rollable;
import uk.org.hexsaw.logactaesque.engine.dice.impl.SevenSidedDiceWithZero;
import uk.org.hexsaw.logactaesque.model.Fixture;
import uk.org.hexsaw.logactaesque.model.FixtureResult;


public class BasicMatchEngineImpl implements MatchEngine {
    
    private static Rollable DICE = new SevenSidedDiceWithZero();

    public FixtureResult playFixture(Fixture fixture) {
    
        FixtureResult fixtureResult = new FixtureResult(fixture);
        fixtureResult.setHomeGoals(DICE.roll());
        fixtureResult.setAwayGoals(DICE.roll());
        return fixtureResult;
    }

}
