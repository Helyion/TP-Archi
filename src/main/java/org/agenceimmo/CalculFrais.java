package org.agenceimmo;

public class CalculFrais {

    public double calculFrais(Appartement appart){
        return appart.getMontant() >= 100000 ? appart.getMontant()* 0.05 : 5000;
    }

    public double calculFrais(AgenceImmo agence, int numero) throws Exception{
        Appartement appart = agence.rechercherAppartement(numero);
        if (appart == null)
            throw new Exception ("Appartement " + numero + " inexistant");
        return this.calculFrais(appart);
    }
}
