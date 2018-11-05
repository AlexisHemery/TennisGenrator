
public class Joueuse extends Personne {

	private String mains;
	String sponsor;
	int classement;
	String entraineur;
	Jupe jupes;
	
	public Joueuse (String nom, String  pren, String surn, Date date, String lieu, Date dece, String natio, double tail, double poid, String mano, String sponso, int clas, String coach, Jupe jp ) {
		super(nom,pren,surn,date,lieu,dece,natio,tail,poid);
		this.mains=mano;
		this.sponsor=sponso;
		this.classement=clas;
		this.entraineur=coach;
		this.jupes=jp;
		this.genre="Femme";
		
	}
	
	public Joueuse (String nom, String  pren, String surn, Date date, String lieu, String natio, double tail, double poid, String mano, String sponso, int clas, String coach, Jupe jp ) {
		super(nom,pren,surn,date,lieu,natio,tail,poid);
		this.mains=mano;
		this.sponsor=sponso;
		this.classement=clas;
		this.entraineur=coach;
		this.jupes=jp;
		this.dateDeces=null;
		this.genre="Femme";
	}
	
	public Joueuse (String nom, String  pren, String surn, String nomcour, Date date, String lieu, String natio, double tail, double poid, String mano, String sponso, int clas, String coach, Jupe jp ) {
		super(nom,pren,surn,nomcour,date,lieu,natio,tail,poid);
		this.mains=mano;
		this.sponsor=sponso;
		this.classement=clas;
		this.entraineur=coach;
		this.jupes=jp;
		this.dateDeces=null;
		this.genre="Femme";
	
	}

	public void SetJupe(Jupe jp) {
		this.jupes=jp;
		System.out.println(this.surnom+": Regardez ma nouvelle jupe, elle est belle avec sa couleur: "+this.jupes);
	}
	
	@Override
	public String toString() {
		return "nom:"+nomNaissance+", prenom:"+prenom+", surnom:"+surnom+", date de naissance:"+dateNaissance+", lieu Naissance:"+lieuNaissance+", date deces:"+dateDeces+", nationalite:"+nationalite+", genre:"+genre+", taille:"+taille+" cm, poids:"+poids+" kg."+" main:"+mains+" sponsor:"+sponsor+" entraineur:"+entraineur+" classement:"+classement+" jupe de couleur:"+jupes;
				}
	
	public void SetClassement(int position) {
		this.classement=position;
		System.out.println("Nouveau classement pour "+this.surnom+" maintenant "+this.classement+" eme mondial");
	}

}
