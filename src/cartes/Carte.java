package cartes;

public class Carte {
	
	private String nomCarte;
	private TypeCarte typeCarte;
	private int valeur;
	
	protected Carte(String nomCarte, TypeCarte typeCarte, int valeur) {
		this.nomCarte = nomCarte;
		this.typeCarte = typeCarte;
		this.valeur = valeur;
	}
	
	public TypeCarte donnerTypeCarte() {
		return typeCarte;
	}
	
	public String getNomCarte() {
		return nomCarte;
	}
	
	public int getValeurCarte() {
		return valeur;
	}
	
}
