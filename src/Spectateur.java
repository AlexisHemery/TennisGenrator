
public class Spectateur extends Personne{

	private double prix;
	Gradin tribune;
	private int numPlace;
	Chemise chemise;


public Spectateur (String nom, String  pren, String surn, Date date, String lieu, Date dece, String natio, double tail, double poid, double pri, Gradin grad, int numPla, Chemise ch ) {
	super(nom,pren,surn,date,lieu,dece,natio,tail,poid);
	this.prix=pri;
	this.tribune=grad;
	this.numPlace=numPla;
	this.chemise=ch;
	this.genre="Homme";
}

public Spectateur(String nom, String  pren, String surn, Date date, String lieu, String natio, double tail, double poid, double pri, Gradin grad, int numPla, Chemise ch) {
	super(nom,pren,surn,date,lieu,natio,tail,poid);
	this.prix=pri;
	this.tribune=grad;
	this.numPlace=numPla;
	this.dateDeces=null;
	this.chemise=ch;
	this.genre="Homme";
}

public Spectateur(String nom, String  pren, String surn, String nomcour, Date date, String lieu, String natio, double tail, double poid, double pri, Gradin grad, int numPla, Chemise ch) {
	super(nom,pren,surn,nomcour,date,lieu,natio,tail,poid);
	this.prix=pri;
	this.tribune=grad;
	this.numPlace=numPla;
	this.dateDeces=null;
	this.chemise=ch;
	this.genre="Homme";
}

public void crier() {
	System.out.println(this.surnom+": WAAAAAAAAAAAAAAAAAAAAHAAAAAAAAAAAAAA !");
}

public void applaudir() {
	System.out.println(this.surnom+": clap clap clap clap");
}

public void huer() {
	System.out.println(this.surnom+": BOOOOUUUHHH t'es nul !!");
}

public void dormir() {
	System.out.println(this.surnom+": ZZZZZZZZZZzzzzzzzZZZZZZ");
}

public void SetChemise(Chemise ch) {
	this.chemise=ch;
	System.out.println(this.surnom+": Regardez mon nouveau short il est beau avec sa couleur: "+this.chemise);
}

@Override
public String toString() {
	return "nom:"+nomNaissance+", prenom:"+prenom+", surnom:"+surnom+", date de naissance:"+dateNaissance+", lieu Naissance:"+lieuNaissance+", date deces:"+dateDeces+", nationalite:"+nationalite+", genre:"+genre+", taille:"+taille+" cm, poids:"+poids+" kg. prix place:"+prix+" gradin:"+tribune+" numero place:"+numPlace+" Chemise de couleur: "+chemise;
			}

}