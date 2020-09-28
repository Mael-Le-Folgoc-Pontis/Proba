package probabilite;

import java.util.ArrayList;

import probabilite.joueurs.Match;

public class Equipe {
	
	private String nomEquipe;
	
	private ArrayList<Match> match;
	
	public Equipe(String nomEquipe) {
		super();
		this.nomEquipe = nomEquipe;
	}

	public ArrayList<Match> getMatch() {
		return match;
	}

	public void ajouterMatch(Match match) {
		// this.match.add(match);
	}

	public String getNomEquipe() {
		return nomEquipe;
	}

}