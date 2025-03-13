package personnages;
import cartes.*;

public class Personnage {
	private int TAILLE_MAX = 5;
	private Carte main[] = new Carte[20];
	private int nbCartesMain = -1; // Pas de cartes au départ
	private String name;
	private int nbPopularite = 0;
	private int pv = 5; // Nombre de coeurs
	
	public Personnage(String name) {
		this.name = name;
	}
	
	public int getNbCarteMain() {
		return nbCartesMain;
	}
	
	public Carte jouerCarte(int index) {
		Carte carte = main[index];
		main[index] = main[nbCartesMain];
		nbCartesMain--;
		return carte;
	}
	
	public void ajoutercarte(Carte carte) {
		if (nbCartesMain<TAILLE_MAX) {
			nbCartesMain++;
			main[nbCartesMain] = carte;
		}
	}
	
	public Carte[] getMain() {
		return main;
	}
	
	public void setPopularite(int n) {
		nbPopularite+=n;
	}
	
	public void setPV(int n) {
		pv += n;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPV() {
		return pv;
	}
	
	public boolean estMort() {
		return pv <= 0;
	}
	
	public boolean estPopulaire() {
		return nbPopularite >= 5;
	}
	
	public int getNbPopularite() {
		return nbPopularite;
	}
}

