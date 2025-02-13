package cartes;

import personnages.Personnage;

public class CarteAttaque extends Carte{
	
	public CarteAttaque(String nomCarte, TypeCarte type, int nb_popularite) {
		super(nomCarte, type, nb_popularite);
	}
	
	public void attaquer(Personnage personne) {
		personne.setPV(getValeurCarte());
	}
}
