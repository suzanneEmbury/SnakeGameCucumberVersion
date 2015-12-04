package uk.ac.manchester.cs.comp33711.snakegamecucumber.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import comp33711.snakegame.SnakeGame;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/* This class contains the step definitions for actions that take place during normal game play
 * and for checks on the status of a running game.
 */

public class GamePlaySteps {

	@Given("^a snake game in play$")
    public void a_snake_game_in_play() {
		SnakeGame testGame = GameWorld.getCurrentGame();
		testGame.start();
    }
	
	
	@When("^the player starts a game$")
    public void the_player_starts_a_game() {
		SnakeGame testGame = GameWorld.getCurrentGame();
		testGame.start();
    }
	
	@When("^the next game tick passes$")
    public void the_next_game_tick_passes() {
		SnakeGame testGame = GameWorld.getCurrentGame();
		testGame.tick();
	}
	
	
	@Then("^trees will be switched (\\w+)$")
    public void trees_will_be_switched_off_or_on(String treeStatus) {
        boolean expectedStatus = (treeStatus.equals("on"));
        
		SnakeGame testGame = GameWorld.getCurrentGame();
		assertThat(testGame.treesAreEnabled(), is(expectedStatus));	
	}
	
	
	@Then("^the option to switch trees on or off is (available|not available)?$")
    public void the_option_to_switch_trees_on_or_off_is_possibly_available(String isAvailable) {
		boolean expectedAvailability = (isAvailable.equals("available"));
		
		SnakeGame testGame = GameWorld.getCurrentGame();
		assertThat(testGame.canCurrentPlayerToggleTrees(), is(expectedAvailability));
    }
}