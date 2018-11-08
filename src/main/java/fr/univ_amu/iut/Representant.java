package fr.univ_amu.iut;

import java.time.LocalDate;

public class Representant extends Commercial
{

    public Representant(int num, String numSecu, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, double base, double nbHeure, double chiffreAffaires, double txCommission)
    {
        super(num, numSecu, nom, prenom, echelon, naissance, embauche, base, nbHeure, chiffreAffaires, txCommission);
        Ordinaire temp = new Ordinaire(0,null,null,null,echelon,null,null,base,nbHeure);
        super.setMySalaireBrut(temp.getMySalaireBrut());
    }
}
