package collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stampsSet = new HashSet<>();
        stampsSet.add(new Stamp("Statek",15.00,25,true));
        stampsSet.add(new Stamp("Pajacyk",15.00,15,false));
        stampsSet.add(new Stamp("Tyranozaur",15.00,20,true));
        stampsSet.add(new Stamp("Statek",15.00,25,true));

        System.out.println(stampsSet.size());
        System.out.println(" ");
        for (Stamp stamp : stampsSet) {
            System.out.println(stamp);
        }
    }

}
