package uk.org.hexsaw.logactaesque.actor;

import static org.junit.Assert.*;

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

    @Before
    public void setUp()
        throws Exception {
    }

    @Test
    public void canPassAMessageToThisActor() {
        ActorSystem system = ActorSystem.create("Logactaesque");
        ActorRef playFixture = system.actorOf(Props.create(PlayFixtureActor.class), "playFixture");
        playFixture.tell(FakeFixture.WBA_v_MANUTD, ActorRef.noSender());
    }

}
