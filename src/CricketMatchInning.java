
public class CricketMatchInning {
	
	private String team1, team2;
	private int totalovr = 0;
	private int currovr = 0;
	
	private Over[] overs;
	
	
	public CricketMatchInning(String tem1, String tem2, int over) {
		team1 = tem1;
		team2 = tem2;
		totalovr = over;
		overs = new Over[totalovr];
		for(int i=0; i<totalovr; i++){
			overs[i]= new Over();
		}
	}
	
	public int getTotalOvers() {
		return totalovr;
	}
	
	public Over getOverAt(int i) {
		return overs[i];
	}
	
	public String getTeam1() {
		return team1;
	}
	public String getTeam2() {
		return team2;
	}
	
	public int addScore(int score){
		int s=0;
		if(currovr<totalovr){
			overs[currovr].addScore(score);
			if(overs[currovr].getCurrentBall()==6){
				currovr++;
			}
			s=score;
		}
		return s;
	}
	
	public int getCurrentOver() {
		return currovr;
	}
	
	public int getCurrentOverBall() {
		return overs[currovr].getCurrentBall();
	}
}
