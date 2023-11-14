package hello;
//team is sean thomas joseph
public class SoccerTeam {//creates soccer teams
	private int losses,ties,wins;
	private static int goals, games;
	public SoccerTeam() {//constructor
		wins = 0;
		losses = 0;
		ties = 0;
	}
	public void played(SoccerTeam other, int fGoals, int cGoals) {//plays other team
		if (fGoals>cGoals) {
			other.losses+=1;
			this.wins+=1;
			}
		else if (fGoals<cGoals) {
			other.wins+=1;
			this.losses+=1;
		}
		else {
			this.ties+=1;
			other.ties+=1;
		}
		goals+=(fGoals+cGoals);
		games+=1;
		
	}
	public int returnPoints() {//win is 3 points, tie is 1, loss is 0
		return wins*3+ties;
	}
	public void reset() {//resets points
		wins = 0;
		losses = 0;
		ties = 0;
	}
	public static int accessGoals() {//returns goals
		return goals;
	}
	public static int accessGames() {//returns games
		return games;
	}
	
	public static void startTournament() {//resets all
		goals = 0;
		games = 0;
	}
}
