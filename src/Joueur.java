
public class Joueur extends Personne {
	
	private String mains;
	String sponsor;
	int classement;
	String entraineur;
	Short shorts;

	public Joueur (String nom, String  pren, String surn, Date date, String lieu, Date dece, String natio, double tail, double poid, String mano, String sponso, int clas, String coach, Short sh ) {
		super(nom,pren,surn,date,lieu,dece,natio,tail,poid);
		this.mains=mano;
		this.sponsor=sponso;
		this.classement=clas;
		this.entraineur=coach;
		this.shorts=sh;
		this.genre="Homme";
		
	}
	
	public Joueur (String nom, String  pren, String surn, Date date, String lieu, String natio, double tail, double poid, String mano, String sponso, int clas, String coach, Short sh ) {
		super(nom,pren,surn,date,lieu,natio,tail,poid);
		this.mains=mano;
		this.sponsor=sponso;
		this.classement=clas;
		this.entraineur=coach;
		this.shorts=sh;
		this.dateDeces=null;
		this.genre="Homme";
	}
	
	public Joueur(String nom, String  pren, String surn, String nomcour, Date date, String lieu, String natio, double tail, double poid, String mano, String sponso, int clas, String coach, Short sh ) {
		super(nom,pren,surn,nomcour,date,lieu,natio,tail,poid);
		this.mains=mano;
		this.sponsor=sponso;
		this.classement=clas;
		this.entraineur=coach;
		this.shorts=sh;
		this.dateDeces=null;
		this.genre="Homme";
	
	}

	public void SetShort(Short sh) {
		this.shorts=sh;
		System.out.println(this.surnom+": Regardez mon nouveau short il est beau avec sa couleur: "+this.shorts);
	}
	
	@Override
	public String toString() {
		return "nom:"+nomNaissance+", prenom:"+prenom+", surnom:"+surnom+", date de naissance:"+dateNaissance+", lieu Naissance:"+lieuNaissance+", date deces:"+dateDeces+", nationalite:"+nationalite+", genre:"+genre+", taille:"+taille+" cm, poids:"+poids+" kg."+" main:"+mains+" sponsor:"+sponsor+" entraineur:"+entraineur+" classement:"+classement+" short de couleur:"+shorts;
				}
	
	public void SetClassement(int position) {
		this.classement=position;
		System.out.println("Nouveau classement pour "+this.surnom+" maintenant "+this.classement+" eme mondial");
	}

}
