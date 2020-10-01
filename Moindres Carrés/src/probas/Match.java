/* Gestion d'un match
 * Match.java 		01/10/2020
 */
package probas;

/**
 * Gestion du comportement d'un match, composé de 2 équipes ayant chacune un score.
 * Le match a également un résultat final indiquant qui a gagné.
 * @author lucas.gremont
 *
 */
public class Match {
	
	/** La première équipe participant au match */
	private Equipe equipe1;
	
	/** La deuxième équipe participant au match */
	private Equipe equipe2;
	
	/** Le score final de la première équipe */
	private int score1;
	
	/** Le score final de la deuxième équipe */
	private int score2;
	
	/** Résultat du match */
	private String resultat;

	/** Création d'un match entre 2 équipes */
	public Match(Equipe equipe1, Equipe equipe2) {
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
	}

	/**
	 * Renvoie l'équipe 1
	 * @return l'équipe 1
	 */
	public Equipe getEquipe1() {
		return equipe1;
	}

	/**
	 * Renvoie l'équipe 2
	 * @return l'équipe 2
	 */
	public Equipe getEquipe2() {
		return equipe2;
	}

	/**
	 * Renvoie le score de l'équipe 1
	 * @return score équipe 1
	 */
	public int getScore1() {
		return score1;
	}
	
	/**
	 * Renvoie le score de l'équipe 2
	 * @return score équipe 2
	 */
	public int getScore2() {
		return score2;
	}
	
	/**
	 * Renvoie le résultat du match
	 * @return le résultat du match
	 */
	public String getResultat() {
		return resultat;
	}
	
	/**
	 * Effectue un match entre les 2 équipes, renvoie le nom de l'équipe gagnante
	 * ou "égalité" si elles sont à égalité
	 * @return le nom de l'équipe gagnante ou "égalité"
	 */
	public String jouerMatch() {
		score1 = (int) Math.round(Math.random()*5);
		score2 = (int) Math.round(Math.random()*5);
		if (score1 > score2) {
			resultat = equipe1.toString();
		} else if (score2 > score1) {
			resultat = equipe2.toString();
		} else {
			resultat = "egalite";
		}
		return resultat;
	}
	
	/**
	 * Forme une chaine contenant toutes les informations concernant un match
	 * @return la chaine formée
	 */
	public String toString() {
		return equipe1 + " contre " + equipe2 + " ; score : " + score1 +"/" + score2 +" ; résultats : " + resultat;	
	}

}
