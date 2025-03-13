package cartes;

public abstract class Carte {
	private String description;
	private TypeCarte typeCarte;
	private int nb_attaque;
	private int nb_popularite;
	
	protected Carte(String description, TypeCarte typeCarte, int nb_popularite, int nb_attaque) {
		this.description = description;
		this.typeCarte = typeCarte;
		this.nb_attaque = nb_attaque;
		this.nb_popularite = nb_popularite;
	}
	
	public String getDescription() {
		return description;
	}
	
	public TypeCarte getType() {
		return typeCarte;
	}
	
	public int getNbPopularite() {
		return nb_popularite;
	}
	
	public int getNbAttaque() {
		return nb_attaque;
	}
	
}
