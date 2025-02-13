package personnages;
import cartes.*;

public class Personnage {
	private Carte cartes[] = new Carte[20];
	private int nb_cartes = -1; // Pas de cartes au départ
	private String name;
	private int popularite = 0;
	private int pv = 5; // Nombre de coeurs
	
	public Personnage(String name) {
		this.name = name;
	}
	
	public void carteAjoutee() {
		nb_cartes++;
	}
	
	public void setPopularite(int n) {
		popularite+=n;
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
	
	public int getPopularite() {
		return popularite;
	}
	public void piocher(Carte carte) {
		nb_cartes++;
		cartes[nb_cartes] = carte;
	}
	
	
}

