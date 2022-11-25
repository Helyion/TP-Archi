package org.agenceimmo;

/**
 * @author ouziri
 */

public class Appartement implements IBien{

    private final int numero;
    private final double montantVente;

    public Appartement(int numero, double montantVente) {
        this.numero = numero;
        this.montantVente = montantVente;
    }

    public int getNumero() {
        return numero;
    }

    public double getMontant() {
        return this.montantVente;
    }
}
