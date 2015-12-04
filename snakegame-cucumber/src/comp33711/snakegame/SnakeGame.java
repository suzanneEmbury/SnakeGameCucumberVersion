package comp33711.snakegame;

public class SnakeGame {

	public SnakeGame(FieldFactory fieldFactory) {
	}
	
	
	// Methods concerned with basic game play
	
	public String getStatus() {
		return null;
	}

	public void start() {
	}

	public void quit() {
	}

	public void tick() {
	}
	
	public Field getField() {
		return null;
	}
	
	
	// Methods concerned with the snake's direction

	public String currentSnakeDirection() {
		return "North";
	}
	
	public void setSnakeDirection(String direction) {
	}

	public void changeSnakeDirection(String requestedDirection) {
	}
	
	
	// Methods concerned with trees on the field
	
	public boolean treesAreEnabled() {
		return false;
	}
	
	public void enableTrees() {
	}

	public void disableTrees() {
	}

	public void toggleTrees() {
	}
	
	
	// Methods concerned with the management of the current player
	
	public void setPlayer(Player player) {
	}
	
	public boolean canCurrentPlayerToggleTrees() {
		return false;
	}

}
