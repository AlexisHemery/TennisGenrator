
public class Date {
	int jour;
	int mois;
	int annee;
	
	public Date(int j, int m, int a) {
		jour=j;
		mois=m;
		annee=a;
	}
	
	@Override
	public String toString() {
		return jour+"/"+mois+"/"+annee;
	}
}
	
