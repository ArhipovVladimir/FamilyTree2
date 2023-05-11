import java.util.*;

public class FamilyTreee  {
    List <Human> humans;
    public FamilyTreee() {
       this (new ArrayList<>());
    }

    public FamilyTreee(List<Human> humans) {
        this.humans = humans;    }

    public  void add (Human human){
        human.add(human);


    }
}


