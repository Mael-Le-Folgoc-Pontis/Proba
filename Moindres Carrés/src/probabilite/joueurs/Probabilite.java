package probabilite.joueurs;

import probabilite.Equipe;

public class Probabilite {
	
	private static final String[] NOM_EQUIPE = 
		{"France","Allemagne","Espagne","Belgique",
				"Brésil","Angleterre","Italie","Argentine",
				"Russie","Etats-unis","Portugal","Algérie",
				"Maroc","Mexique","Chine","Australie"};
	
	private static Equipe[] equipe = new Equipe[16];
	
	private static void runLeague1() {
		for (int i = 0; i < NOM_EQUIPE.length; i++) {
			equipe[i] = new Equipe(NOM_EQUIPE[i]);
		}
		for (int i = 0; i < 4; i++) {
			faireMatch();
		}
	}

	private static void faireMatch() {
		for (int i = 0; i < NOM_EQUIPE.length; i++) {
			if (i%2 == 0) {
				Match match = new Match(equipe[i].getNomEquipe(), equipe[i+1].getNomEquipe(), Math.random()*(5-0), Math.random()*(5-0));
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Bienvenue à ce huitième de finale");
		runLeague1();
	}

}
