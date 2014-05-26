package uk.org.hexsaw.logactaesque.actor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.org.hexsaw.logactaesque.model.FakeFixture;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;


public class PlayFixtureActorIntegrationTest {
    
    private static final Logger logger = LoggerFactory.getLogger(PlayFixtureActorIntegrationTest.class);
    
    private ActorSystem actorSystem  = null;

    @Before
    public void setUp() throws Exception {
        actorSystem = ActorSystem.create("Logactaesque");
    }
    
    @After
    public void tearDown() {
        actorSystem.shutdown();
    }

    @Test
    public void canPassAMessageToThisActor() {
        ActorRef playFixture = actorSystem.actorOf(Props.create(PlayFixtureActor.class), "playFixture");
        playFixture.tell(FakeFixture.WBA_v_MANUTD, ActorRef.noSender());
    }

}
