package devoir;

import java.util.Scanner;

public class Institute {
	
	public String name;
	public String address;
	//Aggregation
	Research_Associate[] Recherche=new Research_Associate[10];
	
	
	public Institute(String nom,String address,Research_Associate[] T) { 
		String nom_faculté="";
		this.name=nom;
		this.address=address;
	    for(int i=0;i<4;i++){
	    	this.Recherche[i]=T[i];
	    }
	    
			
		}
	public void Afficher() {
		System.out.println(" le nom de la institue " +this.name + " l'adresse de l'institue " +this.address);
		for(int i=0;i<4;i++) {
			System.out.println("ses differents sujets de recherches " +this.Recherche[i].fiedOfstudy);
		}
	}
	
	
	

	
	
}
