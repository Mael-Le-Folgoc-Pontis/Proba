/* Championat de football, avec des matchs et des �quipes
 * Championat.java
 */
package probas;

import java.util.ArrayList;
import java.util.Collections;
import probas.Equipe;
import probas.Match;

/**
 * Gestion d'um championat de footbal, compos� de diff�rents matchs jou�s par des �quipes
 * @author lucas.gremont
 *
 */
public class Championat {
	
	/**
	 * Tableau contenant les noms des diff�rentes �quipes
	 */
	private static final String[] NOMS_EQUIPES = 
		{"France","Allemagne","Espagne","Belgique",
				"Br�sil","Angleterre","Italie","Argentine",
				"Russie","Etats-unis","Portugal","Alg�rie",
				"Maroc","Mexique","Chine","Australie"};
	
	/**
	 * Liste des �quipes
	 */
	private static ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	
	/**
	 * Liste de matchs entre 2 �quipes
	 */
	private static ArrayList<Match> matchs = new ArrayList<Match>();
	
	/**
	 * Cr�ation d'un championnat
	 */
	public static void jouerChampionat() {
		// Cr�ation des �quipes
		for (int i = 0; i < NOMS_EQUIPES.length; i++) {
			//System.out.println(NOMS_EQUIPES[i]);
			equipes.add(new Equipe(NOMS_EQUIPES[i]));
		}
		// m�lange des �quipes
		Collections.shuffle(equipes);
		
		// Cr�ation des matchs entre les �quipes
		for (int i = 0; i < NOMS_EQUIPES.length / 2; i++) {
			matchs.add(new Match(equipes.get(i*2), equipes.get(i*2+1)));
			matchs.get(i).jouerMatch();
		}
	}
	
	/**
	 * Affiche les r�sultats du match dans la console et les enregistre dans un fichier CSV
	 */
	public static void afficherResutlatsChampionat() {
		for(int i = 0; i < matchs.size(); i++) {
			System.out.println(matchs.get(i));
			// TODO ajouter les r�sultats dans un fichier CSV
		}
	}
	
	/**
	 * Effectue le championat
	 * @param args non utilis�
	 */
	public static void main(String[] args) {
		jouerChampionat();
		afficherResutlatsChampionat();
		// TODO rajouter format coupe(perdant je joue plus), championat (tout le monde joue le m�me nombre de matchs)
	}

}
