package fr.univ_amu.iut;

import java.time.LocalDate;

public class Employes
{
    private int myNum;
    private String myNumSecu;
    private String myNom;
    private String myPrenom;
    private int myEchelon;
    private LocalDate myNaissance;
    private LocalDate myEmbauche;
    private double myBase;
    private double myNbHeure;
    private double mySalaireBrut;
    private double mySalaireNet;

    public Employes(int num, String numSecu, String nom, String prenom, int echelon, LocalDate naissance, LocalDate embauche, double base, double nbHeure)
    {
        this.myNum = num;
        this.myNumSecu = numSecu;
        this.myNom = nom;
        this.myPrenom = prenom;
        this.myEchelon = echelon;
        this.myNaissance = naissance;
        this.myEmbauche = embauche;
        this.myBase = base;
        this.myNbHeure = nbHeure;
        this.mySalaireBrut = this.myBase * this.myNbHeure;
        this.mySalaireNet = this.mySalaireBrut * 0.8;
    }

    @Override
    public String toString()
    {
        return "Employes{" +
                "myNum=" + myNum +
                ", myNumSecu='" + myNumSecu + '\'' +
                ", myNom='" + myNom + '\'' +
                ", myPrenom='" + myPrenom + '\'' +
                ", myEchelon=" + myEchelon +
                ", myNaissance=" + myNaissance +
                ", myEmbauche=" + myEmbauche +
                ", myBase=" + myBase +
                ", myNbHeure=" + myNbHeure +
                ", mySalaireBrut=" + mySalaireBrut +
                ", mySalaireNet=" + mySalaireNet +
                '}' + "\n";
    }

    public void setMySalaireBrut(double mySalaireBrut)
    {
        this.mySalaireBrut = mySalaireBrut;
    }
}
