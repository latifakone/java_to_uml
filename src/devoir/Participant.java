package devoir;


public class Participant{
	public int nbre_heurs_travail;
	Research_Associate[] recherches=new Research_Associate[4];
	Project[] projets=new Project[4];
	public Participant(int nbre_heur,Research_Associate[] R,Project P[]) {
		this.nbre_heurs_travail=nbre_heur;
		for(int i=0;i<4;i++) {
			recherches[i]=R[i];
			projets[i]=P[i];
		}
	}

}
