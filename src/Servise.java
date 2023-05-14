public class Servise {

    private static FamilyTreee FamilyTreee = new FamilyTreee();

    public Servise(FamilyTreee familyTreee) {
        this.FamilyTreee = familyTreee;

    }
    public static void addHuman (Human human) {
        FamilyTreee.add(human);
    }
}
