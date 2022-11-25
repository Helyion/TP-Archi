package org.agenceimmo;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author ouziri
 *
 */

public class AgenceImmo {
	
	private Map<Integer, Appartement> appartements = new TreeMap<>();
	private CalculFrais calculateur = new CalculFrais();
	
	public void ajouterAppartement(Appartement appart) throws Exception {
		if (this.rechercherAppartement(appart.getNumero()) != null)
			throw new Exception ("Appartement " + appart.getNumero() + " deja existant");
		this.appartements.put(appart.getNumero(), appart);
	}
	
	public Appartement rechercherAppartement(int numero) {
		return this.appartements.get(numero);
	}
	
	// calcul de frais d'agence
	public double calculFraisAgence(Appartement appart){
		return this.calculateur.calculFrais(appart);
	}
	
	public double calculFraisAgence(int numero) throws Exception{
		return this.calculateur.calculFrais(this, numero);
	}
}