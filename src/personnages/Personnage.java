package jeu;

public class Personnage {
	private String name;
	private int popularite = 0;
	private int vie = 5; // Nombre de coeur
	
	public Personnage(String name) {
		this.name = name;
	}
	
	public void decreasePopularite(int n) {
		popularite-=n;
	}
	
	public void increasePopularite(int n) {
		popularite+=n;
	}
	
	public void decreaseVie(int n) {
		vie-=n;
	}
	
	public String getName() {
		return name;
	}
	
	public int getVie() {
		return vie;
	}
	
	public int getPopularite() {
		return popularite;
	}
}

