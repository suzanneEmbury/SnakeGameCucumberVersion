package uk.ac.manchester.cs.comp33711.snakegamecucumber.steps;

import org.joda.time.Duration;

import uk.ac.manchester.cs.comp33711.snakegamecucumber.acctest.fakes.FakePlayer;
import cucumber.api.java.en.Given;

/* This class contains the step definitions for getting setting up players with particular
 * characteristics.
 */

public class PlayerCreationSteps {

	@Given("^a player with (.*) of playing time$")
    public void a_player_with_seconds_of_playing_time(String playingTime) throws Throwable {
      FakePlayer player = new FakePlayer("Fake Player");
      player.setPlayingTimeSoFar(durationOf(playingTime));
      GameWorld.setPlayer(player);
    }

	
	// Conversion Methods (human-readable to software-readable)
	
	private Duration durationOf(String playingTime) {
		return null;
	}
	
}
