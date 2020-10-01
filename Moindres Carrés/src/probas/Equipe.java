/* Classe contenant les informations sur une �quipe
 * Equipe.java 		01/10/2020
 */
package probas;

/**
 * Gestion d'une �quipe de foot, elle a un nom.
 * @author lucas.gremont
 *
 */
public class Equipe {
	
	/** Nom de l'�quipe */
	private String nom;
	
	public Equipe(String nom) {
		this.nom = nom;
	}

	/**
	 * Forme une chaine de caract�res contenant le nom de l'�quipe
	 * @return la chaine form�e
	 */
	@Override
	public String toString() {
		return nom;
	}
}
