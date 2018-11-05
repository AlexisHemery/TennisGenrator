
public class Arbitres extends Personne{
	
	public Arbitres(String nom, String  pren, String surn, Date date, String lieu, Date dece, String natio, String genres, double tail, double poid ) {
		super(nom,pren,surn,date,lieu,dece,natio,genres,tail,poid);
	}
	
	public Arbitres(String nom, String  pren, String surn, Date date, String lieu, String natio, String genres, double tail, double poid) {
		super(nom,pren,surn,date,lieu,natio,genres,tail,poid);
		this.dateDeces=null;
	}
	
	public Arbitres(String nom, String  pren, String surn, String nomcour, Date date, String lieu, String natio, String genres, double tail, double poid ) {
		super(nom,pren,surn,nomcour,date,lieu,natio,genres,tail,poid);
		this.dateDeces=null;
	}
	
	public void AnnonceScore(String score) {
			System.out.println("Aritre: "+score);
	}

	public void AnnonceFaute(String FAUTE) {
		System.out.println("Arbitre: "+FAUTE);
	}
	
	public void FaireTairreLeStade() {
		System.out.println("Arbitre: VOS GUEULES CA JOUE !");
	}
	
	@Override
	public String toString() {
		return "nom:"+nomNaissance+", prenom:"+prenom+", surnom:"+surnom+", date de naissance:"+dateNaissance+", lieu Naissance:"+lieuNaissance+", date deces:"+dateDeces+", nationalite:"+nationalite+", genre:"+genre+", taille:"+taille+" cm, poids:"+poids+" kg.";
				}
	
}
