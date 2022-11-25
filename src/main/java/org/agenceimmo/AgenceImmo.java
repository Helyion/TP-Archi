package enonce.agenceimmo;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author ouziri
 *
 */

public class AgenceImmo {
	
	private Map<Integer, Appartement> appartements = new TreeMap<>();
	
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
		return appart.getMontant() >= 100000 ? appart.getMontant()* 0.05 : 5000;
	}
	
	public double calculFraisAgence(int numero) throws Exception{
		Appartement appart = this.rechercherAppartement(numero);
		if (appart == null)
			throw new Exception ("Appartement " + appart.getNumero() + " inexistant");
		return appart.getMontant() >= 100000 ? appart.getMontant()* 0.05 : 5000;
	}

}
