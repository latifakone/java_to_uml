package devoir;

public class Research_Associate extends Employé{

	public String fiedOfstudy;
	Faculty faculté_recherche;
	Project[] projet_concernes=new Project[4];
	public Research_Associate(String fiedOfstudy) {
		this.fiedOfstudy=fiedOfstudy;
	}
	
}
