/* Championat de football, avec des matchs et des équipes
 * Championat.java
 */
package probas;

import java.util.ArrayList;
import java.util.Collections;
import probas.Equipe;
import probas.Match;

/**
 * Gestion d'um championat de footbal, composé de différents matchs joués par
 * des équipes
 * 
 * @author lucas.gremont
 *
 */
public class Championat {

	/**
	 * Tableau contenant les noms des différentes équipes
	 */
	private static final String[] NOMS_EQUIPES_DEFAUT = { "France", "Allemagne", "Espagne", "Belgique", "Brésil",
			"Angleterre", "Italie", "Argentine", "Russie", "Etats-unis", "Portugal", "Algérie", "Maroc", "Mexique",
			"Chine", "Australie" };

	/**
	 * Liste des équipes
	 */
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();

	/**
	 * Liste de matchs entre 2 équipes
	 */
	private ArrayList<Match> matchs = new ArrayList<Match>();

	/**
	 * Liste des gagnants d'une manche
	 */
	private ArrayList<Equipe> gagnants = new ArrayList<Equipe>();

	/**
	 * Création d'un championat se déroulant avec les équipes par défaut
	 */
	public Championat() {
		// Création des équipes
		for (int i = 0; i < NOMS_EQUIPES_DEFAUT.length; i++) {
			// System.out.println(NOMS_EQUIPES[i]);
			equipes.add(new Equipe(NOMS_EQUIPES_DEFAUT[i]));
		}
		// mélange des équipes
		Collections.shuffle(equipes);
	}

	/**
	 * Création d'un championnat
	 */
	public void jouerChampionat() {
		do {
			System.out.println(equipes.size());
			// Création des matchs entre les équipes
			for (int i = 0; i < equipes.size(); i+=2) {
				matchs.add(new Match(equipes.get(i), equipes.get(i + 1)));
				gagnants.add(matchs.get(i/2).jouerMatchCoupe());
			}
			// on remplace les équipes par la liste des gagnants
			equipes.clear();
			equipes.addAll(gagnants);
			gagnants.clear();
		} while (equipes.size() >1);
	}

	/**
	 * Affiche les résultats du match dans la console et les enregistre dans un
	 * fichier CSV
	 */
	public void afficherResutlatsChampionat() {
		for (int i = 0; i < matchs.size(); i++) {
			System.out.println(matchs.get(i));
			// TODO ajouter les résultats dans un fichier CSV
		}
	}

}
