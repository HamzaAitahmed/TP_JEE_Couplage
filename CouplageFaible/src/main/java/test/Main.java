package test;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import ioc.moteur.IMoteur;
import ioc.moteur.MoteurBatterie;
import ioc.moteur.MoteurDiesel;
import ioc.moteur.MoteurEssence;
import ioc.voiture.Voiture;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// ########## static Main ############## 
		    
		  
			/*	 
		Voiture v1 = new Voiture();
		v1.setMoteur(new MoteurBatterie());
		v1.bouger();
		
		v1.setMoteur(new MoteurEssence());
		v1.bouger();
		
		v1.setMoteur(new MoteurDiesel());
		v1.bouger();
				
		
		*/
				
				
		// ########## Dynamique Main ############## 
		Voiture v1 = new Voiture();
		
		
		Scanner sc = new Scanner(new File("src/main/java/config.txt"));
		String Moteur = sc.nextLine();
		
		do {
			
			Class ClsMoteur = Class.forName(Moteur);
			IMoteur ObjMoteur = (IMoteur) ClsMoteur.newInstance();
			
			v1.setMoteur(ObjMoteur);
			v1.bouger();
			Moteur = sc.nextLine();
		
		}while(sc.hasNext());
		
		
	}

}
