
public class Over {
	
	private int[] Balls;
	private int currBall = 0;
	public Over() {
		Balls = new int[6];
		for(int i=0; i<6; i++){
			Balls[i]=0;
		}
	}
	
	public int getCurrentBall() {
		return currBall;
	}
	
	public int[] getBalls() {
		return Balls;
	}
	
	public int getScoreAtBall(int i){
		return Balls[i];
	}
	
	public void setScoreAtBall(int i, int score){
		Balls[i] = score;
	}
	
	public void addScore(int score){
		if(currBall<6){
			Balls[currBall] = score;
			currBall++;
		}
	}
}
