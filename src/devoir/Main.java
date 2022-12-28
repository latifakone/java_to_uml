package devoir;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] research_tab={"MATH","PHYSIQUE","ANALYSE","ART PLASTIQUE"};
       
        Research_Associate[] recherche=new Research_Associate[4];
		for(int i=0;i<4;i++) {
			recherche[i]=new Research_Associate(research_tab[i]);
		}
		
		Institute in=new Institute("Esatic","BP AGBOVILLE",recherche);
		in.Afficher();
		Administrative_Employé Em=new Administrative_Employé();
		
		}
	}


