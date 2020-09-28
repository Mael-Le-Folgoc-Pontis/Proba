package probabilite.joueurs;

import java.util.ArrayList;
import java.util.Collections;

import probabilite.Equipe;

public class Probabilite {
	
	/**
	 * Tableau contenant les nomns des diff�rentes �quipe
	 */
	private static final String[] NOM_EQUIPE = 
		{"France","Allemagne","Espagne","Belgique",
				"Br�sil","Angleterre","Italie","Argentine",
				"Russie","Etats-unis","Portugal","Alg�rie",
				"Maroc","Mexique","Chine","Australie"};
	
	/**
	 * ArrayList conenant toutes les �quipe
	 */
	private static ArrayList<Equipe> equipe = new ArrayList<Equipe>();
	
	/**
	 * Initialise la ArrayList des �quipes
	 */
	private static void runLeague1() {
		for (int i = 0; i < NOM_EQUIPE.length; i++) {
			equipe.add(new Equipe(NOM_EQUIPE[i]));
		}
		Collections.shuffle(equipe);
	}

	/**
	 * Fais les 8 premiers matchs
	 */
	private static void faireMatch1() {
		Match match = null;
		for (int i = 0; i < NOM_EQUIPE.length; i++) {
			if (i%2 == 0) {
				match = new Match(equipe.get(i).getNomEquipe(), equipe.get(i+1).getNomEquipe(), (int)(Math.random() * ((5 - 0) + 1)), (int)(Math.random() * ((5 - 0) + 1)));
				equipe.get(i).ajouterMatch(match);
				equipe.get(i+1).ajouterMatch(match);
				if (match.getScore1() > match.getScore2()) {
					equipe.remove(i);
				} else {
					equipe.remove(i+1);
				}
				System.out.println(match.toString());
			}
		}
	}
	
	/**
	 * 
	 */
	private static void faireMatch2() {
		
	}

	public static void main(String[] args) {
		System.out.println("Bienvenue � ce huiti�me de finale");
		runLeague1();
		faireMatch1();
		faireMatch2();
	}

}
