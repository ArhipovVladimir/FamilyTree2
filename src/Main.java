import java.util.List;

public class Main {

        public static void main(String[] args) {
        FamilyTreee FamilyTreee = new FamilyTreee();


        Servise.addHuman(new Human("Evg", "m"));
        Servise.addHuman(new Human("Motr", "f"));
        Servise.addHuman(new Human("Vera", "f", "Evg", "Motr"));
        Servise.addHuman(new Human("Zoia", "f", "Evg", "Motr"));

//        Human[] Human;
//        for (Human Humans:Human) {
//            System.out.println(Humans);

        }






    }

}