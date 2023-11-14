package hello;
//team is sean thomas joseph
public class PlayTournament {//plays tournament
	public static void main(String[] args) {
		SoccerTeam alpha = new SoccerTeam();
		SoccerTeam bravo = new SoccerTeam();
		SoccerTeam charlie = new SoccerTeam();
		SoccerTeam delta = new SoccerTeam();
		alpha.played(bravo, 5, 3);
		charlie.played(delta, 4, 3);
		bravo.played(delta, 2, 4);
		alpha.played(charlie, 1, 2);
		System.out.println(alpha.returnPoints());//3
		System.out.println(charlie.returnPoints());
		System.out.println(delta.returnPoints());
		System.out.println(bravo.returnPoints());
		System.out.println(SoccerTeam.accessGames());
		System.out.println(SoccerTeam.accessGoals());
		SoccerTeam.startTournament();
		alpha.reset();
		bravo.reset();
		charlie.reset();
		delta.reset();
		alpha.played(bravo, 4,2);
		bravo.played(charlie, 5, 3);
		charlie.played(delta, 1, 1);
		delta.played(alpha, 1, 6);
		System.out.println(alpha.returnPoints());//6
		System.out.println(charlie.returnPoints());//1
		System.out.println(delta.returnPoints());//1
		System.out.println(bravo.returnPoints());//3
		System.out.println(SoccerTeam.accessGames());//4
		System.out.println(SoccerTeam.accessGoals());//23
	}
}
