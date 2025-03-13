package cartes;

public enum TypeCarteSpeciale {
	CARTE_SPECIALE_1("Coup de sabre", 1, -1), CARTE_SPECIALE_2("Main de Fer", 2, -1);
		
		private String chaine;
		private int degats;
		private int nb_pop;
		TypeCarteSpeciale(String description, int nb_pop, int nb_attaque) {
			this.chaine = description;
			this.nb_pop = nb_pop;
			this.degats = nb_attaque;
		}
		
		@Override
		public String toString() {
			return chaine;
		}
		
		public int getNbAttaque() {
			return degats;
		}
		
		public int getNbPopularite() {
			return nb_pop;
		}
}
