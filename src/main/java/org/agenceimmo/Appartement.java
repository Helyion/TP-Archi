package enonce.agenceimmo;

/**
 * @author ouziri
 *
 */

public class Appartement {
  
	private int numero;
	private double montantVente;	
  	
	public Appartement(int numero, double montantVente) {
		this.numero = numero;
		this.montantVente = montantVente;
	}

	public int getNumero() {
		return numero;
	}
	
	public double getMontant (){
		return this.montantVente;
	}
}
