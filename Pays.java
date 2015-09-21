
public class Pays {
	// Easy money aeaeaeaea
	private String nom;
	private String langue;
	private String monnaie;
	private String capitale;
	private Ville lesVilles[] = new Ville[100];
	private int compteurVille = 0;
	private static int compteurPays = 0;
	
	
	public Pays(String unNom, String uneLangue, String uneMonnaie, String uneCapitale) {
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.capitale = uneCapitale;
		this.compteurPays = this.compteurPays+1;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String unNom) {
		this.nom = unNom;	
	}
	
	public String toString() {
		String info;
		info = pMaj(this.getNom()) + " : " + this.langue + ", " + this.monnaie + ", " + this.capitale;
		return info;
	}
	
	public String majuscule() {
		String nomMaj = this.nom.toUpperCase();
		return nomMaj;
	}
	

	public void ajoutVille(Ville uneVille) {
		lesVilles[compteurVille] = uneVille;
		compteurVille = compteurVille+1;
		
	}
	
	public void affichervilles(){
		System.out.println("liste des villes du pays: ");
		for (int i=0; i<compteurVille; i=i+1) {
			
			System.out.println(lesVilles[i]);
		}
	}
	
	private String pMaj(String unNom) {

		String nomM=unNom.replaceFirst(".",(unNom.charAt(0)+"").toUpperCase());
		return nomM;
	}
	
	
	
	

}
