package fr.univ_amu.iut;

import java.time.LocalDate;

public class Commercial extends Employes
{
    private double myChiffreAffaires;
    private double myTauxCommission;

    public Commercial(int num, String numSecu, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, double base, double nbHeure, double chiffreAffaires, double txCommission)
    {
        super(num, numSecu, nom, prenom, echelon, naissance, embauche, base, nbHeure);
        this.myChiffreAffaires = chiffreAffaires;
        this.myTauxCommission = txCommission;
        super.setMySalaireBrut(base + this.myChiffreAffaires * this.myTauxCommission);
    }

    public void negocierTransaction()
    {
        System.out.println("je négocie une négociation");
    }
}
