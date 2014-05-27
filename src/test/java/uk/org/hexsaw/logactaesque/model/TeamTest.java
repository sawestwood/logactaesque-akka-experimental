package uk.org.hexsaw.logactaesque.model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TeamTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void thatTeamsWithSameNameAreEqual() {
        assertThat(new Team("West Ham United", "WHU"), equalTo(new Team("West Ham United", "XXX")));
    }
    
    @Test
    public void thatTeamsWithDifferentNameAreNotEqual() {
        assertThat(FakeTeam.TEAM_MAN_UTD, not(equalTo(FakeTeam.TEAM_WBA)));
    }
    
    @Test
    public void thatTeamsWithSameNameReturnSameHashCode() {
        assertThat(new Team("West Ham United", "WHU").hashCode(), equalTo(new Team("West Ham United", "XXX").hashCode()));
    }

    @Test
    public void thatTeamsWithDifferentNameDoNotHaveSameHashCode() {
        assertThat(FakeTeam.TEAM_MAN_UTD.hashCode(), not(equalTo(FakeTeam.TEAM_WBA.hashCode())));
    }

}
