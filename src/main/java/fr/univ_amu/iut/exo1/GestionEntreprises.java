package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEntreprises
{
    public static void main(String[] args)
    {
        ArrayList<Employes> employes = new ArrayList<Employes>();
        employes.add(new Employes(1, "abc", "Corre", "Morgan", 1, LocalDate.of(1999, Month.SEPTEMBER, 20), LocalDate.of(2018, Month.NOVEMBER, 8), 10, 100));
        employes.add(new Employes(2, "abc", "Alamelle", "Vincent", 2, LocalDate.of(1999, Month.OCTOBER, 22), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 90));
        employes.add(new Employes(3, "abc", "Bouteiller", "Theo", 2, LocalDate.of(1999, Month.DECEMBER, 21), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 80));
        employes.add(new Employes(4, "abc", "Robot1", "Automatique", 2, LocalDate.of(2017, Month.JANUARY, 1), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 70));
        employes.add(new Employes(5, "abc", "Robot2", "Automatique", 2, LocalDate.of(2017, Month.JANUARY, 1), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 60));
        employes.add(new Employes(6, "abc", "Robot3", "Automatique", 2, LocalDate.of(2017, Month.JANUARY, 1), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 50));
        employes.add(new Employes(7, "abc", "Robot4", "Automatique", 2, LocalDate.of(2017, Month.JANUARY, 1), LocalDate.of(2018, Month.NOVEMBER, 8), 8, 40));
        Entreprises monEntreprise = new Entreprises("maBoiteInfo", employes);
        System.out.println(monEntreprise);
    }
}