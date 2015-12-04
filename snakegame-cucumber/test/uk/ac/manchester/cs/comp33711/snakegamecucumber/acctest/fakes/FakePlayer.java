package uk.ac.manchester.cs.comp33711.snakegamecucumber.acctest.fakes;

import org.joda.time.Duration;

import comp33711.snakegame.Player;

public class FakePlayer extends Player {

	@SuppressWarnings("unused")
	private Duration accumulatedPlayingTime = new Duration(Duration.ZERO);

	public FakePlayer(String playerName) {
		super(playerName);
	}

	public void setPlayingTimeSoFar(Duration playingTime) {
		accumulatedPlayingTime  = playingTime;
	}

}
