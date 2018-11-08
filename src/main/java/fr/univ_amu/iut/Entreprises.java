package fr.univ_amu.iut;

import java.time.LocalDate;
import java.util.ArrayList;

public class Entreprises
{
    private String myNom;
    private ArrayList<Employes> myEmployes = new ArrayList<Employes>();

    public Entreprises(String nom, ArrayList<Employes> employes)
    {
        this.myNom = nom;
        this.myEmployes = employes;
    }

    @Override
    public String toString() {
        return "Entreprises{" + "\n" +
                "myNom='" + myNom + '\'' + "\n" +
                ", myEmployes=" + myEmployes +
                '}';
    }

    public void embauche(LocalDate date)
    {

    }

    public void licenciement()
    {

    }

    public void setNom(String nom)
    {
        this.myNom = nom;
    }

}
