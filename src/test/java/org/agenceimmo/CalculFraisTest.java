package org.agenceimmo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculFraisTest {

    private CalculFrais calculateur;

    @BeforeEach
    void setUp(){
        calculateur = new CalculFrais();
    }

    @Test
    void testCalculFraisAgenceEgale() {
        Appartement appart = new Appartement(1, 100000);
        assertEquals(calculateur.calculFrais(appart), 5000);
    }

    @Test
    void testCalculFraisAgenceMin() {
        Appartement appart = new Appartement(1, 1000);
        assertEquals(calculateur.calculFrais(appart), 5000);
    }

    @Test
    void testCalculFraisAgenceSup() {
        Appartement appart = new Appartement(1, 1000000);
        assertEquals(calculateur.calculFrais(appart), 50000);
    }

    @Test
    void testCalculFraisAgenceEgaleV2() throws Exception {
        CalculFrais calculateur = new CalculFrais();
        AgenceImmo agence = new AgenceImmo();
        Appartement appart = new Appartement(1, 100000);
        agence.ajouterAppartement(appart);
        assertEquals(calculateur.calculFrais(agence, appart.getNumero()), 5000);
    }
    @Test
    void testCalculFraisAgenceMinV2() throws Exception {
        CalculFrais calculateur = new CalculFrais();
        AgenceImmo agence = new AgenceImmo();
        Appartement appart = new Appartement(1, 1000);
        agence.ajouterAppartement(appart);
        assertEquals(calculateur.calculFrais(agence, appart.getNumero()), 5000);
    }
    @Test
    void testCalculFraisAgenceSupV2() throws Exception {
        CalculFrais calculateur = new CalculFrais();
        AgenceImmo agence = new AgenceImmo();
        Appartement appart = new Appartement(1, 1000000);
        agence.ajouterAppartement(appart);
        assertEquals(calculateur.calculFrais(agence, appart.getNumero()), 50000);
    }
}