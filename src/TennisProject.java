
public class TennisProject {
	
	public static void main(String[] args) {
		//Personne Nadal = new Personne("Nadal","Raphael","Rafa",new Date(10,1,1997),"Madrid","Espagne","Homme",186.0,83.0);
		//System.out.println(Nadal.getAge());
		//Joueur Tsonga = new Joueur("Tsonga","Wilfried","bueno",new Date(25,6,1991),"Amiens","France","Femme",198.3,83.0,"droite","Kinder Bueno",10,"Hémery", Short.Black);
		//Tsonga.SetPoids(73.0);
		//Tsonga.SetShort(Short.Blue);
		//System.out.println(Tsonga);
		Spectateur JA = new Spectateur("Hermel","Jean-Alexis","JA", new Date(12,2,1997),"BGville","France",176.0,68.0,123.0, Gradin.Ouest, 34, Chemise.Blue);
		System.out.println(JA);
		//JA.huer();
		//JA.applaudir();
		//JA.crier();
		//JA.dormir();
		Arbitres Dede = new Arbitres("De","De","DeDe", new Date(13,5,1963),"Dunkerque","France","Homme",123.0,93.0);
		System.out.println(Dede);
		Dede.FaireTairreLeStade();
		Spectatrice Franckette = new Spectatrice("Franckette","Vincent", "Franckeket", new Date(13,6,1972),"Lens","France",186.0,81.0,83, Gradin.Nord, 13, Lunettes.Pink);
		System.out.println(Franckette);
		Franckette.huer();
		Franckette.crier();
		Franckette.applaudir();
		Franckette.dormir();
		Franckette.SetLunettes(Lunettes.Red);
		System.out.println(Franckette);
	}
}
