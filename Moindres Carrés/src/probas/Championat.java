/* Championat de football, avec des matchs et des �quipes
 * Championat.java
 */
package probas;

import java.util.ArrayList;
import java.util.Collections;
import probas.Equipe;
import probas.Match;

/**
 * Gestion d'um championat de footbal, compos� de diff�rents matchs jou�s par
 * des �quipes
 * 
 * @author lucas.gremont
 *
 */
public class Championat {

	/**
	 * Tableau contenant les noms des diff�rentes �quipes
	 */
	private static final String[] NOMS_EQUIPES_DEFAUT = { "France", "Allemagne", "Espagne", "Belgique", "Br�sil",
			"Angleterre", "Italie", "Argentine", "Russie", "Etats-unis", "Portugal", "Alg�rie", "Maroc", "Mexique",
			"Chine", "Australie" };

	/**
	 * Liste des �quipes
	 */
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();

	/**
	 * Liste de matchs entre 2 �quipes
	 */
	private ArrayList<Match> matchs = new ArrayList<Match>();

	/**
	 * Liste des gagnants d'une manche
	 */
	private ArrayList<Equipe> gagnants = new ArrayList<Equipe>();

	/**
	 * Cr�ation d'un championat se d�roulant avec les �quipes par d�faut
	 */
	public Championat() {
		// Cr�ation des �quipes
		for (int i = 0; i < NOMS_EQUIPES_DEFAUT.length; i++) {
			// System.out.println(NOMS_EQUIPES[i]);
			equipes.add(new Equipe(NOMS_EQUIPES_DEFAUT[i]));
		}
		// m�lange des �quipes
		Collections.shuffle(equipes);
	}

	/**
	 * Cr�ation d'un championnat
	 */
	public void jouerChampionat() {
		do {
			System.out.println(equipes.size());
			// Cr�ation des matchs entre les �quipes
			for (int i = 0; i < equipes.size(); i+=2) {
				matchs.add(new Match(equipes.get(i), equipes.get(i + 1)));
				gagnants.add(matchs.get(i/2).jouerMatchCoupe());
			}
			// on remplace les �quipes par la liste des gagnants
			equipes.clear();
			equipes.addAll(gagnants);
			gagnants.clear();
		} while (equipes.size() >1);
	}

	/**
	 * Affiche les r�sultats du match dans la console et les enregistre dans un
	 * fichier CSV
	 */
	public void afficherResutlatsChampionat() {
		for (int i = 0; i < matchs.size(); i++) {
			System.out.println(matchs.get(i));
			// TODO ajouter les r�sultats dans un fichier CSV
		}
	}

}
