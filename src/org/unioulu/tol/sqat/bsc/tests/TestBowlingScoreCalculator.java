package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testCreatingNewFrameWith1and1PinsKnockedDown() {
		//arrange
		Frame frame = new Frame(2,4);
		//act
		//assert
		assertEquals("2,4", frame.getFirstThrow() + "," + frame.getSecondThrow());
	}
	
	@Test
	public void testCountingSingleFrameScoreWith2and6PinsKnockedDownIs8() {
		//arrange
		Frame frame = new Frame(2,6);
		//act
		//assert
		assertEquals(8, frame.getTotalScore());
	}
	
	@Test
	public void testCreatingNewGameConsistingOfOneFrame1and5GameScoreShouldbe6() {
		//arrange
		BowlingGame game = new BowlingGame();
		Frame frame = new Frame(1,5);
		//act
		game.addFrame(frame);
		//assert
		assertEquals(6, game.score());
	}

}
