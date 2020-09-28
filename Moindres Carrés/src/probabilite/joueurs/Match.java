package probabilite.joueurs;

public class Match {
	
	private String equipe1;
	
	private String equipe2;
	
	private int score1;
	
	private int score2;

	public Match(String equipe1, String equipe2, int score1, int score2) {
		super();
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.score1 = score1;
		this.score2 = score2;
	}

	public String getEquipe1() {
		return equipe1;
	}

	public String getEquipe2() {
		return equipe2;
	}

	public int getScore1() {
		return score1;
	}

	public int getScore2() {
		return score2;
	}
	
	public String toString() {
		return this.equipe1 + " = " + this.score1 + "   " + this.equipe2 + " = " + this.score2;
	}

}
