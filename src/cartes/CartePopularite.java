package cartes;

import personnages.Personnage;

public class CartePopularite extends Carte{
	
	public CartePopularite(String nomCarte, TypeCarte type, int nb_popularite) {
		super(nomCarte, type, nb_popularite);
	}
	
	
	
	public void gagnerPopularite(Personnage personne) {
		personne.setPopularite(getValeurCarte());
	}
}
