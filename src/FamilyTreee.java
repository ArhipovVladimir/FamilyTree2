import java.util.*;

public class FamilyTreee  {
    List <Human> humans;
    public FamilyTreee() {
        List <Human> Human = new Human().getChildern();
    }

    public FamilyTreee(List<Human> humans) {
        this.humans = humans;    }


     static void add (Human human) {
        FamilyTreee.add(human);

    }

}


