import java.awt.*;


public class CondMazeLab extends Maze {

	public void step() {			
		// ADD YOUR CODE HERE
		// to make PussInBoots take a SINGLE STEP.
		if(puss.isFacingWall()) 
		{
			puss.left();
		}
		else if (puss.isFacingGully())
		{
			if (puss.isTipToeing())
			{
				puss.stopTipToe();
			}
			if (puss.isInBoots())
			{
				puss.takeOffBoots();
			}
			puss.jump();
			puss.right();
		}
		else if (puss.isFacingDog())
		{
			if (puss.isInBoots())
			{	
				puss.takeOffBoots();
			}
			if (!puss.isTipToeing())
			{
				puss.startTipToe();
			}
			puss.forward();
			puss.right();

		}
		else if (puss.isFacingMud()) 
		{

			if (puss.isTipToeing())
			{
				puss.stopTipToe();
			}
			if (!puss.isInBoots())
			{
				puss.putOnBoots();
			}
			puss.forward();
			puss.right();
		}
		else
		{	
			puss.forward();
			puss.right();
		}
		// Note: NO LOOPING STATEMENTS ARE NEEDED!
		//
		// The code we've provided repeatedly calls
		// this method to make PussInBoots take multiple
		// steps through the maze.
	}		

	public CondMazeLab() {
		super(true);
	}

	public static void main(String[] args) {
		CondMazeLab myMaze = new CondMazeLab();	
	}
}
