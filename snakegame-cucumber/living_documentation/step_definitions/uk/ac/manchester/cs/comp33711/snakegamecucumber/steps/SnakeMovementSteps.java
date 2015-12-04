package uk.ac.manchester.cs.comp33711.snakegamecucumber.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import comp33711.snakegame.SnakeGame;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SnakeMovementSteps {

	@Given("^the snake is facing (\\w+)$")
    public void the_snake_is_facing(String direction) {
		SnakeGame testGame = GameWorld.getCurrentGame();
		testGame.changeSnakeDirection(direction);
    }
	
	@Given("^the player requests a change of direction to (\\w+)$")
    public void the_player_requests_a_change_of_direction_to(String direction) {
		SnakeGame testGame = GameWorld.getCurrentGame();
		testGame.changeSnakeDirection(direction);
	}
	
	
	@Then("^the snake's direction will become (\\w+)$")
    public void the_snakes_direction_will_become(String expectedDirection) {
		SnakeGame testGame = GameWorld.getCurrentGame();
		String actualDirection = testGame.currentSnakeDirection();
		assertThat(actualDirection, is(expectedDirection));
	}
	
}
