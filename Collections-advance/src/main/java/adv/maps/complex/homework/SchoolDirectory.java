package adv.maps.complex.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> directory = new HashMap<>();

        Principal principal = new Principal("Zenon", "Walasik");
        Principal principal2 = new Principal("Ksawery", "Gałczyński");
        Principal principal3 = new Principal("Maksymilian", "Konieczko");
        Principal principal4 = new Principal("Aleksander", "Walczak");

        School school = new School("Publiczna Szkoła Podstawowa w Kielcach nr 7", 15, 20, 21, 14, 18, 30);
        School school1 = new School("Publiczna Szkoła Podstawowa w Kielcach nr 2", 14, 23, 21, 14, 18, 30);
        School school2 = new School("Publiczna Szkoła Podstawowa w Starachowicach nr 4", 11, 14, 16, 22, 18, 11);
        School school3 = new School("Publiczna Szkoła Podstawowa w Ostrowcu Św. nr 1", 15, 10, 21, 14, 12, 15);

        directory.put(principal,school);
        directory.put(principal2,school1);
        directory.put(principal3,school2);
        directory.put(principal4,school3);

        for (Map.Entry<Principal, School> principalSchoolEntry : directory.entrySet()) {
//            System.out.println(principalSchoolEntry);
            System.out.println(principalSchoolEntry.getKey());
            System.out.println(principalSchoolEntry.getValue());
        }

        }
    }

