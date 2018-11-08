package fr.univ_amu.iut;

import java.time.LocalDate;

public class Technicien extends Employes
{

    public Technicien(int num, String numSecu, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, double base, double nbHeure)
    {
        super(num, numSecu, nom, prenom, echelon, naissance, embauche, base, nbHeure);
    }

    public void fabriquerProduit()
    {
        System.out.println("je fabrique un produit");
    }
}
