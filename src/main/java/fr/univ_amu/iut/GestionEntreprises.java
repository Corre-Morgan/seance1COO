package fr.univ_amu.iut;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEntreprises
{
    public static void main(String[] args)
    {
        ArrayList<Employes> employes = new ArrayList<Employes>();
        employes.add(new Technicien(1, "abc", "Corre", "Morgan", 10, LocalDate.of(1999, Month.SEPTEMBER, 20), LocalDate.of(2018, Month.NOVEMBER, 8), 10, 100, 1000, 50));
        employes.add(new Commercial(2, "abc", "Alamelle", "Vincent", 5, LocalDate.of(1999, Month.OCTOBER, 22), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 90, 1000,40));
        employes.add(new Commercial(3, "abc", "Bouteiller", "Theo", 5, LocalDate.of(1999, Month.DECEMBER, 21), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 80,1000,30));
        employes.add(new Ordinaire(4, "abc", "Robot1", "Automatique", 4, LocalDate.of(2017, Month.JANUARY, 1), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 70));
        employes.add(new Vendeur(5, "abc", "Robot2", "Automatique", 4, LocalDate.of(2017, Month.JANUARY, 1), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 60,1000,20));
        employes.add(new Representant(6, "abc", "Robot3", "Automatique", 4, LocalDate.of(2017, Month.JANUARY, 1), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 50,1000,20));
        employes.add(new Ordinaire(7, "abc", "Robot4", "Automatique", 4, LocalDate.of(2017, Month.JANUARY, 1), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 40));
        Entreprises monEntreprise = new Entreprises("maBoiteInfo", employes);
        System.out.println(monEntreprise);
        monEntreprise.repartitionPrime(100);
        System.out.println(monEntreprise);
    }
}