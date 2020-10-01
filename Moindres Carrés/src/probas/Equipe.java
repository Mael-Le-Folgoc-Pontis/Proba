/* Classe contenant les informations sur une équipe
 * Equipe.java 		01/10/2020
 */
package probas;

/**
 * Gestion d'une équipe de foot, elle a un nom.
 * @author lucas.gremont
 *
 */
public class Equipe {
	
	/** Nom de l'équipe */
	private String nom;
	
	public Equipe(String nom) {
		this.nom = nom;
	}

	/**
	 * Forme une chaine de caractères contenant le nom de l'équipe
	 * @return la chaine formée
	 */
	@Override
	public String toString() {
		return nom;
	}
}
