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
		boolean isStrike = false;
		
		for (Frame frame : frames){
			
			if (isStrike)
				gameScore += 2 * frame.score();
			else
				gameScore += frame.score();
			
			isStrike = false;
			
			if (frame.isStrike())
				isStrike = true;
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
