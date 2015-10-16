package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

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
		boolean previousWasStrike = false;
		boolean wasStrike = false;
		boolean wasSpare = false;
		
		for (Frame frame : frames){
			
			if (previousWasStrike)
				gameScore += 2 * 10 + frame.getFirstThrow();
			else if (wasStrike)
				gameScore += 2 * frame.score();
			else if (wasSpare)
				gameScore += frame.score() + frame.getFirstThrow();
			else
				gameScore += frame.score();
			
			previousWasStrike = false;
			wasStrike = false;
			wasSpare = false;
			
			if (frame.isStrike() && wasStrike == true){
				previousWasStrike = true;
				wasStrike = true;
			}
			else if (frame.isStrike())
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
