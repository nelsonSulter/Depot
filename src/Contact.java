
public class Contact {
	// attributs privés easy 1.0 BETA
	private String nom;
	private String prenom;
	private String telephone;
	private String mail;
	private int anneenaissance;
	private String login;
	
	public Contact() {
		
	}
	
	public Contact(String unNom) {
		this.nom = unNom;
		
	}
	
	public Contact(String unNom, String unPrenom) {
		this.nom = unNom;
		this.prenom = unPrenom;
	}
	
	public Contact (String unNom, String unPrenom, String telephone) {
		this.nom = unNom;
		this.prenom = unPrenom;
		this.telephone = telephone;
	}
	
	public Contact(String unNom, String unPrenom, String telephone, String unMail) {
		this.nom = unNom;
		this.prenom = unPrenom;
		this.telephone = telephone;
		this.mail = unMail;
	}
	
	public Contact(String unNom, String unPrenom, String telephone, String unMail, int annee) {
		this.nom = unNom;
		this.prenom = unPrenom;
		this.telephone = telephone;
		this.mail = unMail;
		this.anneenaissance = annee;
		this.login = makeLogin(unPrenom, unNom);
	}
	
	
	public String getNom () {
		return this.nom;
	}
	
	public void setNom (String unNom) {
		this.nom = unNom;
	}
	
	public int getAnneeNaissance () {
		return this.anneenaissance;
	}
	
	public void setAnneeNaissance ( int uneAnnee ) {
		this.anneenaissance = uneAnnee;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;	
	}
	
	public void setPrenom (String unPrenom) {
		this.prenom = unPrenom;
	}
	
	public String getPrenomMajMin (String unPrenom) {
		String maj = unPrenom.substring(0,1);
		String min = unPrenom.substring(1,unPrenom.length());
		return this.prenom = maj.toUpperCase()+min.toLowerCase();
	}
	
	public String getPrenom () {
		return this.prenom;
	}
	
	public String getInitialesMaj (String unPrenom, String unNom) {
		String premier = unPrenom.substring(0,1);
		String deuxieme = unNom.substring(0,1);
		String initial = premier.toUpperCase()+"."+deuxieme.toUpperCase();
		return initial;
	}
	
	public String makeLogin (String unPrenom, String unNom) {
		String premier = unPrenom.substring(0,1);
		String deuxieme = unNom.substring(0,nom.length());
		String login = premier+deuxieme;
		return login;
	}
	
	
	public String toString () {
		String chaine = "";
		if (this.nom != null) {
			chaine = this.nom;
			
		}
		
		if (this.prenom != null) {
			chaine = this.nom + " " + getPrenomMajMin(this.prenom);
		}
		
		if (this.telephone != null) {
			chaine = this.nom + " " + getPrenomMajMin(this.prenom) + " " + this.telephone;
		}
		if (this.mail != null) {
			chaine = this.nom + " " + getPrenomMajMin(this.prenom) + " " + this.telephone + " " + this.mail;
			
		}
		
		if (this.anneenaissance != 0) {
			chaine = this.nom + " " + getPrenomMajMin(this.prenom) + " " + this.telephone + " " + this.mail + " " + this.anneenaissance + " " + getInitialesMaj(this.prenom,this.nom);
		}
		
		return chaine;
	}
}
