package uk.ac.manchester.cs.comp33711.snakegamecucumber.steps;

import uk.ac.manchester.cs.comp33711.snakegamecucumber.acctest.fakes.FakePlayer;
import comp33711.snakegame.SnakeGame;

public class GameWorld {

	private static SnakeGame testGame = new SnakeGame(null);

	public static SnakeGame getCurrentGame() {
		return testGame;
	}

	public static void setPlayer(FakePlayer player) {
	}

}
