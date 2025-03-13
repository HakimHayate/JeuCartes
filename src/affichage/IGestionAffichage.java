package affichage;

import cartes.TypeCarte;

public interface IGestionAffichage {
	void afficherCarte(String description, TypeCarte type, int nb_attaque, int nb_popularite);
	void afficherJoueurCourantStats(String joueur, int pv, int nb_popularite);
	void afficher(String s);
	void next(String name);
	void joueurPioche(String name);
	void joueurAttaque(String name, String name2, int nbAttaque);
	void joueurGagnePV(String name, int nbPopularite);
	void joueCarte(String name, int indice_carte_joue);
}
