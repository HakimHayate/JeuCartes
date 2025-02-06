package cartes;

abstract class Carte {
	private String nomCarte;
	private TypeCarte typeCarte;
	
	protected Carte(String nomCarte, TypeCarte typeCarte) {
		this.nomCarte = nomCarte;
		this.typeCarte = typeCarte;
	}
	
	public TypeCarte donnerTypeCarte() {
		return typeCarte;
	}
	
	public String getNomCarte() {
		return nomCarte;
	}
	
}
