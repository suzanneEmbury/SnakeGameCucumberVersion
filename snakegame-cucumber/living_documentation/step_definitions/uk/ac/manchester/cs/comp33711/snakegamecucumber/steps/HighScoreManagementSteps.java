package uk.ac.manchester.cs.comp33711.snakegamecucumber.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.joda.time.DateTime;

import comp33711.highscoresserver.HighScoresServer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HighScoreManagementSteps {
	
	private HighScoresServer server = new HighScoresServer();
	private String username = "fake_user";
	
	@Given("^a player with a high score of (\\d+)$")
    public void a_player_with_a_high_score_of(int highScore) {
		server.addPlayer(username);
		server.setLatestScoreAchieved(username, highScore, DateTime.now());
    }
	
	@When("^the player finishes a game with a score of (\\d+)$")
    public void the_player_finishes_a_game_with_a_score_of(int newScore) {
		server.setLatestScoreAchieved(username, newScore, DateTime.now());
    }

	@Then("^the player's new high score should be (\\d+)$")
    public void the_players_new_high_score_should_be(int expectedHighScore) {
        int actualHighScore = server.getHighestScoreByNamedPlayer(username);
        assertThat(actualHighScore, is(expectedHighScore));
    }
}
