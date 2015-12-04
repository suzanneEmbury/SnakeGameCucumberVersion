package comp33711.highscoresserver;

import java.util.List;

import org.joda.time.DateTime;

import comp33711.snakegame.Score;

public class HighScoresServer {

	public void addPlayer(String username) {
	}

	public void setLatestScoreAchieved(String username, int score, DateTime scoreDate) {
	}

	public List<Score> getTopHighScores(int numRequired) {
		return null;
	}

	public List<Score> getTopHighScores() {
		return null;
	}

	public Score getHighScoreByName(String username) {
		return null;
	}

	public int getHighestScoreByNamedPlayer(String username) {
		return 0;
	}
	
}
