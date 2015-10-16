package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;


//finished at 13:41

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		this.frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	

	public int score(){
		int gameScore = 0;
		boolean wasStrike = false;
		boolean twoStrikes = false;
		boolean wasSpare = false;
		
		for (Frame frame : frames){
			
			if (twoStrikes)
				gameScore += (2 * 10) + frame.getFirstThrow();
			else if (wasStrike)
				gameScore += 2 * frame.score();
			else if (wasSpare)
				gameScore += frame.score() + frame.getFirstThrow();
			else
				gameScore += frame.score();
			
			if (frame.isStrike() && wasStrike)
				twoStrikes = true;
			
			wasStrike = false;
			wasSpare = false;
			
			if (frame.isStrike())
				wasStrike = true;
			if (frame.isSpare())
				wasSpare = true;
		}
		return gameScore;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}

	public int numberOfFrames() {
		return this.frames.size();
	}
}
