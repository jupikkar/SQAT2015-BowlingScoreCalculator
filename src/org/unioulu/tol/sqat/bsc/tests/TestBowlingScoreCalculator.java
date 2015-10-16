package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testCreatingNewFrameWith1and1PinsKnockedDown() {
		//arrange
		Frame frame = new Frame(1,1);
		//act
		//assert
		assertEquals("1,1", frame.getFirstThrow() + "," + frame.getSecondThrow());
	}
	
	@Test
	public void testCountingSingleFrameScoreWith2and6PinsKnockedDownIs8() {
		//arrange
		Frame frame = new Frame(2,6);
		//act
		//assert
		assertEquals(8, frame.getTotalScore());
	}

}
