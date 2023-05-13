import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTreee FamilyTreee = new FamilyTreee();

        Human Human1 = new Human("Evg", "m", null, null);
        Human Human2 = new Human("Motr", "f", null, null);
        Human Human3 = new Human("Vera", "f", "Evg", "Motr");
        Human Human4 = new Human("Zoia", "f", "Evg", "Motr");
        FamilyTreee.add(Human1);
        FamilyTreee.add(Human2);
        FamilyTreee.add(Human3);
        FamilyTreee.add(Human4);






    }

}