package uk.org.hexsaw.logactaesque.actor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.org.hexsaw.logactaesque.model.Fixture;
import uk.org.hexsaw.logactaesque.model.FixtureResult;
import uk.org.hexsaw.logactaesque.service.MatchService;
import akka.actor.UntypedActor;

public class PlayFixtureActor extends UntypedActor  {
    
    private static final Logger logger = LoggerFactory.getLogger(PlayFixtureActor.class);
    
    private MatchService matchService = null;
    
    public PlayFixtureActor(MatchService matchService) {
        this.matchService = matchService;
    }


    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof Fixture) {
            FixtureResult fixtureResult = matchService.playFixture((Fixture)message);
            logger.info(fixtureResult.toString());
        }
    }
    
   

}
