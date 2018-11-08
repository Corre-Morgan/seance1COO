package fr.univ_amu.iut;

import java.time.LocalDate;

public class Ordinaire extends  Employes
{

    public Ordinaire(int num, String numSecu, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, double base, double nbHeure)
    {
        super(num, numSecu, nom, prenom, echelon, naissance, embauche, base, nbHeure);
        super.setMySalaireBrut(base * nbHeure + echelon * 100);

    }



    public void effectuerTacheOrdinaire()
    {
        System.out.println("je fais une tâche ordinaire");
    }
}
