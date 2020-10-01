/* Gestion d'un match
 * Match.java 		01/10/2020
 */
package probas;

/**
 * Gestion du comportement d'un match, compos� de 2 �quipes ayant chacune un score.
 * Le match a �galement un r�sultat final indiquant qui a gagn�.
 * @author lucas.gremont
 *
 */
public class Match {
	
	/** La premi�re �quipe participant au match */
	private Equipe equipe1;
	
	/** La deuxi�me �quipe participant au match */
	private Equipe equipe2;
	
	/** Le score final de la premi�re �quipe */
	private int score1;
	
	/** Le score final de la deuxi�me �quipe */
	private int score2;
	
	/** R�sultat du match */
	private String resultat;

	/** Cr�ation d'un match entre 2 �quipes */
	public Match(Equipe equipe1, Equipe equipe2) {
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
	}

	/**
	 * Renvoie l'�quipe 1
	 * @return l'�quipe 1
	 */
	public Equipe getEquipe1() {
		return equipe1;
	}

	/**
	 * Renvoie l'�quipe 2
	 * @return l'�quipe 2
	 */
	public Equipe getEquipe2() {
		return equipe2;
	}

	/**
	 * Renvoie le score de l'�quipe 1
	 * @return score �quipe 1
	 */
	public int getScore1() {
		return score1;
	}
	
	/**
	 * Renvoie le score de l'�quipe 2
	 * @return score �quipe 2
	 */
	public int getScore2() {
		return score2;
	}
	
	/**
	 * Renvoie le r�sultat du match
	 * @return le r�sultat du match
	 */
	public String getResultat() {
		return resultat;
	}
	
	/**
	 * Effectue un match entre les 2 �quipes, renvoie le nom de l'�quipe gagnante
	 * ou "�galit�" si elles sont � �galit�
	 * @return le nom de l'�quipe gagnante ou "�galit�"
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
	 * @return la chaine form�e
	 */
	public String toString() {
		return equipe1 + " contre " + equipe2 + " ; score : " + score1 +"/" + score2 +" ; r�sultats : " + resultat;	
	}

}
