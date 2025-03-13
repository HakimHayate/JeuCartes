package affichage;

import cartes.TypeCarte;

public class Affichage implements IGestionAffichage{
	
	@Override
	public void afficherCarte(String description, TypeCarte type, int nb_attaque, int nb_popularite) {
		System.out.println("Type :" + type + ", " +description +", nb popularite = "+nb_popularite +", degats = "+nb_attaque);
	}

	@Override
	public void afficherJoueurCourantStats(String joueur, int pv, int nb_popularite) {
		System.out.println("Joueur courant: " + joueur +", pv = "+ pv+", nombre de popularite = "+ nb_popularite);
		
	}

	@Override
	public void afficher(String s) {
		System.out.println();
		System.out.println(s);	
	}

	@Override
	public void next(String name) {
		
		System.out.println(name + " a terminé son tour");
		System.out.println();
		System.out.println();
	}
	
	@Override
	public void joueurPioche(String name) {
		System.out.println(name + " pioche une carte");
	}
	
	@Override
	public void joueurAttaque(String name, String name2, int nbAttaque) {
		System.out.println(name + " attaque "+name2+ " en infligeant "+nbAttaque+" dégâts.");
		
	}
	
	@Override
	public void joueurGagnePV(String name, int nbPopularite) {
		System.out.println(name+" gagne "+ nbPopularite+ " de pv");
		
	}
	
	@Override
	public void joueCarte(String name, int indice_carte_joue) {
		System.out.println(name + " a joué la carte "+indice_carte_joue);
		
	}

	

}
