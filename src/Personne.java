import java.util.Calendar;

public class Personne {

	protected String nomNaissance;
	String nomCourant;
	protected String prenom;
	public String surnom;
	protected Date dateNaissance;
	protected String lieuNaissance;
	protected Date dateDeces;
	String nationalite;
	protected String genre;
	public double taille;
	public double poids;

	public Personne(String nom, String  pren, String surn, Date date, String lieu, Date dece, String natio, double tail, double poid ) {
		this.nomNaissance=nom;
		this.prenom=pren;
		this.surnom=surn;
		this.dateNaissance=date;
		this.lieuNaissance=lieu;
		this.dateDeces=dece;
		this.nationalite=natio;
		this.taille=tail;
		this.poids=poid;
	}
	
	public Personne(String nom, String  pren, String surn, Date date, String lieu, String natio, double tail, double poid ) {
		this.nomNaissance=nom;
		this.prenom=pren;
		this.surnom=surn;
		this.dateNaissance=date;
		this.lieuNaissance=lieu;
		this.nationalite=natio;
		this.taille=tail;
		this.poids=poid;
		this.dateDeces=null;
	}
	
	public Personne(String nom, String  pren, String surn, String nomcour, Date date, String lieu, String natio, double tail, double poid ) {
		this.nomNaissance=nom;
		this.prenom=pren;
		this.surnom=surn;
		this.nomCourant=nomcour;
		this.dateNaissance=date;
		this.lieuNaissance=lieu;
		this.nationalite=natio;
		this.taille=tail;
		this.poids=poid;
		this.dateDeces=null;
	}
	
	public Personne(String nom, String  pren, String surn, Date date, String lieu, Date dece, String natio, String genres, double tail, double poid ) {
		this.nomNaissance=nom;
		this.prenom=pren;
		this.surnom=surn;
		this.dateNaissance=date;
		this.lieuNaissance=lieu;
		this.dateDeces=dece;
		this.nationalite=natio;
		this.taille=tail;
		this.poids=poid;
		this.genre=genres;
	}
	
	public Personne(String nom, String  pren, String surn, Date date, String lieu, String natio, String genres, double tail, double poid ) {
		this.nomNaissance=nom;
		this.prenom=pren;
		this.surnom=surn;
		this.dateNaissance=date;
		this.lieuNaissance=lieu;
		this.nationalite=natio;
		this.taille=tail;
		this.poids=poid;
		this.dateDeces=null;
		this.genre=genres;
	}
	
	public Personne(String nom, String  pren, String surn, String nomcour, Date date, String lieu, String natio, String genres, double tail, double poid ) {
		this.nomNaissance=nom;
		this.prenom=pren;
		this.surnom=surn;
		this.nomCourant=nomcour;
		this.dateNaissance=date;
		this.lieuNaissance=lieu;
		this.nationalite=natio;
		this.taille=tail;
		this.poids=poid;
		this.dateDeces=null;
		this.genre=genres;
	}
	
	public int getAge() {
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		int thisMonth = Calendar.getInstance().get(Calendar.MONTH)+1;
		int thisDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

		if(this.dateDeces!=null) {
			 thisYear=this.dateDeces.annee;
			 thisMonth=this.dateDeces.mois;
			 thisDay=this.dateDeces.jour;
		}

		if(this.dateNaissance.mois<thisMonth) {
			return (thisYear -this.dateNaissance.annee);		
			}
		
		if(this.dateNaissance.mois==thisMonth) {
			
			if(thisDay<=this.dateNaissance.jour) {
				return (thisYear -this.dateNaissance.annee);
			}
			else {
				return (thisYear -this.dateNaissance.annee-1);
			}
		
		}
		
		else {
			System.out.println("this.dateNaissance.mois=="+this.dateNaissance.mois+"   thisMonth=="+thisMonth);
			return (thisYear - this.dateNaissance.annee -1);
		}
	}
	
	public void SetTaille(double height) {
		this.taille=height;
		System.out.println("Nouvelle taille pour "+this.surnom+" maintenant "+this.taille+" cm");
	}
	
	public void SetPoids(double weight) {
		this.poids=weight;
		System.out.println("Nouvelle poids pour "+this.surnom+" maintenant "+this.poids+" kg");
	}
	
	
@Override
public String toString() {
	return "nom:"+nomNaissance+", prenom:"+prenom+", surnom:"+surnom+", date de naissance:"+dateNaissance+", lieu Naissance:"+lieuNaissance+", date deces:"+dateDeces+", nationalite:"+nationalite+", genre:"+genre+", taille:"+taille+" cm, poids:"+poids+" kg.";
			}
}
