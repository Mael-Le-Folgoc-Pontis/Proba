/* Championat de football, avec des matchs et des équipes
 * Championat.java
 */
package probas;

import java.util.ArrayList;
import java.util.Collections;
import probas.Equipe;
import probas.Match;

/**
 * Gestion d'um championat de footbal, composé de différents matchs joués par des équipes
 * @author lucas.gremont
 *
 */
public class Championat {
	
	/**
	 * Tableau contenant les noms des différentes équipes
	 */
	private static final String[] NOMS_EQUIPES = 
		{"France","Allemagne","Espagne","Belgique",
				"Brésil","Angleterre","Italie","Argentine",
				"Russie","Etats-unis","Portugal","Algérie",
				"Maroc","Mexique","Chine","Australie"};
	
	/**
	 * Liste des équipes
	 */
	private static ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	
	/**
	 * Liste de matchs entre 2 équipes
	 */
	private static ArrayList<Match> matchs = new ArrayList<Match>();
	
	/**
	 * Création d'un championnat
	 */
	public static void jouerChampionat() {
		// Création des équipes
		for (int i = 0; i < NOMS_EQUIPES.length; i++) {
			//System.out.println(NOMS_EQUIPES[i]);
			equipes.add(new Equipe(NOMS_EQUIPES[i]));
		}
		// mélange des équipes
		Collections.shuffle(equipes);
		
		// Création des matchs entre les équipes
		for (int i = 0; i < NOMS_EQUIPES.length / 2; i++) {
			matchs.add(new Match(equipes.get(i*2), equipes.get(i*2+1)));
			matchs.get(i).jouerMatch();
		}
	}
	
	/**
	 * Affiche les résultats du match dans la console et les enregistre dans un fichier CSV
	 */
	public static void afficherResutlatsChampionat() {
		for(int i = 0; i < matchs.size(); i++) {
			System.out.println(matchs.get(i));
			// TODO ajouter les résultats dans un fichier CSV
		}
	}
	
	/**
	 * Effectue le championat
	 * @param args non utilisé
	 */
	public static void main(String[] args) {
		jouerChampionat();
		afficherResutlatsChampionat();
		// TODO rajouter format coupe(perdant je joue plus), championat (tout le monde joue le même nombre de matchs)
	}

}
