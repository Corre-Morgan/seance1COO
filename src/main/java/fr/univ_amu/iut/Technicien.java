package fr.univ_amu.iut;

import java.time.LocalDate;

public class Technicien extends Employes
{
    private int myNbUnitesProduites;
    private double myTauxCommissionUnite;

    public Technicien(int num, String numSecu, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, double base, double nbHeure, int nbUnitesProduites, double tauxCommissionUnite)
    {
        super(num, numSecu, nom, prenom, echelon, naissance, embauche, base, nbHeure);
        this.myNbUnitesProduites = nbUnitesProduites;
        this.myTauxCommissionUnite = tauxCommissionUnite;
        super.setMySalaireBrut(base * nbHeure + this.myNbUnitesProduites * this.myTauxCommissionUnite);
    }

    public void fabriquerProduit()
    {
        System.out.println("je fabrique un produit");
    }
}
