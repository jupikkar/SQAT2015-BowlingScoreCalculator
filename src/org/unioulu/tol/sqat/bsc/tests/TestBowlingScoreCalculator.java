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
		String score = "1 and 1";
		//assert
		assertEquals(score, frame.getFirstThrow() + " and " + frame.getSecondThrow());
	}

}
