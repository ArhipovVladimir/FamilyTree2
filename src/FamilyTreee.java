import java.util.*;

public class FamilyTreee  {
    List <Human> humans;
    public FamilyTreee() {
       this (new ArrayList<>());
    }

    public FamilyTreee(List<Human> humans) {
        this.humans = humans;    }


    public static void add (Human human) {
        FamilyTreee.add(human);
    }
}


