package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	
//	@Before 
//	public void setupGame() {
//		
//	}
	

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
		assertEquals(8, frame.score());
	}
	
	@Test
	public void testCreatingNewGameConsistingOfOneFrame1and5GameScoreShouldbe6() {
		//arrange
		BowlingGame game1 = new BowlingGame();
		Frame frame = new Frame(1,5);
		//act
		game1.addFrame(frame);
		//assert
		assertEquals(1, game1.numberOfFrames());
	}
	
	@Test
	public void testCreatingGameWith10FramesFromAssignment(){
		//arrange
		BowlingGame game = new BowlingGame();
		Frame frame1 = new Frame(1,5);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
//		//act
		//assert
		
		assertEquals(10, game.numberOfFrames());
	}
	
	@Test
	public void testCalculatingGameScoreWithPrebuiltGameShouldBe81(){
		//act
		BowlingGame game = new BowlingGame();
		Frame frame1 = new Frame(1,5);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);
		//act
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		//assert
		assertEquals(81, game.score());
	}
	
	@Test
	public void testNewBowlingGameWithTwoFramesOneStrikeand1and1ShouldBe14(){
		//arrange
		BowlingGame game1 = new BowlingGame();
		Frame firstFrame = new Frame(10,0);
		Frame secondFrame = new Frame(1,1);
		//act
		game1.addFrame(firstFrame);
		game1.addFrame(secondFrame);
		//assert
		assertEquals(14, game1.score());
	}
	
	@Test
	public void testSampleBowlingGameScoreIfFirstIsStrikeShouldBe94(){
		//arrange
		BowlingGame game = new BowlingGame();
		Frame frame1 = new Frame(10,0);
		Frame frame2 = new Frame(3,6);
		Frame frame3 = new Frame(7,2);
		Frame frame4 = new Frame(3,6);
		Frame frame5 = new Frame(4,4);
		Frame frame6 = new Frame(5,3);
		Frame frame7 = new Frame(3,3);
		Frame frame8 = new Frame(4,5);
		Frame frame9 = new Frame(8,1);
		Frame frame10 = new Frame(2,6);
		//act
		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		//assert
		assertEquals(94, game.score());
	}
}
