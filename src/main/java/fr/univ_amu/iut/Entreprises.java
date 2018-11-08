package fr.univ_amu.iut;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    public void repartitionPrime(int prime)
    {
        while (prime !=0)
        {
            long temp = 0;

            try
            {
                for (int i =0; i < myEmployes.size(); ++i)
                {
                    long nbMois = ChronoUnit.MONTHS.between(myEmployes.get(i).getMyEmbauche(), LocalDate.now());
                    if (nbMois > temp)
                    {
                        temp = nbMois;
                        Employes employeTemp = myEmployes.get(0);
                        myEmployes.set(0,myEmployes.get(i));
                        myEmployes.set(i,employeTemp);
                    }
                }
                if (prime <= 10)
                    myEmployes.get(0).setMySalaireNet(myEmployes.get(0).getMySalaireNet() + prime);
                else
                {
                    myEmployes.get(0).setMySalaireNet(myEmployes.get(0).getMySalaireNet() + prime / 2);
                    prime = prime / 2;
                }
            }
            catch (NullPointerException e)
            {
                System.out.println("Erreur");
            }

        }
    }

    public void setNom(String nom)
    {
        this.myNom = nom;
    }

}
