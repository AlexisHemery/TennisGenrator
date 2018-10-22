import java.util.Calendar;


public class Personne {
	
	private String nomNaissance;
	String nomCourant;
	private String prenom;
	public String surnom;
	private Date dateNaissance;
	private String lieuNaissance;
	private Date dateDeces;
	String nationalite;
	private String genre;
	public double taille;
	public double poids;

	public Personne(String nom, String  pren, String surn, Date date, String lieu, Date dece, String natio, String genres, double tail, double poid ) {
		nomNaissance=nom;
		prenom=pren;
		surnom=surn;
		dateNaissance=date;
		lieuNaissance=lieu;
		dateDeces=dece;
		nationalite=natio;
		genre=genres;
		taille=tail;
		poids=poid;
	}
	
	public Personne(String nom, String  pren, String surn, Date date, String lieu, String natio, String genres, double tail, double poid ) {
		nomNaissance=nom;
		prenom=pren;
		surnom=surn;
		dateNaissance=date;
		lieuNaissance=lieu;
		nationalite=natio;
		genre=genres;
		taille=tail;
		poids=poid;
		dateDeces=new Date(0,0,0);
	}
	
	public Personne(String nom, String  pren, String surn, String nomcour, Date date, String lieu, String natio, String genres, double tail, double poid ) {
		nomNaissance=nom;
		prenom=pren;
		surnom=surn;
		nomCourant=nomcour;
		dateNaissance=date;
		lieuNaissance=lieu;
		nationalite=natio;
		genre=genres;
		taille=tail;
		poids=poid;
		dateDeces=new Date(0,0,0);
	}
	
	public int getAge() {
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		int thisMonth = Calendar.getInstance().get(Calendar.MONTH);
		int thisDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

		if(this.dateDeces.annee!=0) {
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
				return (thisYear -this.dateNaissance.annee -1);
			}
		}
		else {
			return (thisYear - this.dateNaissance.annee -1);
		}
	}
	
	
	
	
	
	
@Override
public String toString() {
	return "nom:"+nomNaissance+", prenom:"+prenom+", surnom:"+surnom+", date de naissance:"+dateNaissance+", lieu Naissance:"+lieuNaissance+", date deces:"+dateDeces+", nationalite:"+nationalite+", genre:"+genre+", taille:"+taille+" cm, poids:"+poids+" kg.";
			}
}




