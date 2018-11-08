package fr.univ_amu.iut;

import java.time.LocalDate;

public class Vendeur extends Commercial
{

    public Vendeur(int num, String numSecu, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, double base, double nbHeure, double chiffreAffaires, double txCommission)
    {
        super(num, numSecu, nom, prenom, echelon, naissance, embauche, base, nbHeure, chiffreAffaires, txCommission);
    }
}
