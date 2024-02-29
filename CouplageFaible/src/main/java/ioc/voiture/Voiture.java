package ioc.voiture;

import ioc.moteur.IMoteur;
import ioc.moteur.MoteurDiesel;

public class Voiture {
	IMoteur moteur;
	
	public void setMoteur(IMoteur m)
	{
		this.moteur = m;
	}
	
	public void bouger()
	{
		moteur.demmarer();
		System.out.println("La voiture Bouge\n");
	}
}
