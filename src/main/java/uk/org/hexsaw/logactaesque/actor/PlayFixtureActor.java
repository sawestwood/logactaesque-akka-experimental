package uk.org.hexsaw.logactaesque.actor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.org.hexsaw.logactaesque.model.Fixture;
import akka.actor.UntypedActor;

public class PlayFixtureActor extends UntypedActor  {
    
    private static final Logger logger = LoggerFactory.getLogger(PlayFixtureActor.class);

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof Fixture) {
            logger.info(message.toString());
        }
    }
    
   

}
