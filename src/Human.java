import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Human extends FamilyTreee {
    String name;
    String gender;
    String father;
    String mother;
    List<Human> childern;

    public Human (String name, String gender) {
        this.name = name;
        this.gender = gender;
        String father = null;
        String mother = null;
        List<Human> childern = null;

    }
    public Human (String name, String gender, String father, String mother) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        List<Human> childern = null;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public List<Human> getChildern() {
        return childern;
    }

    public void setChildern(List<Human> childern) {
        this.childern = childern;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", childern=" + childern +
                '}';
    }

    @Override
    public void replaceAll(UnaryOperator<FamilyTreee> operator) {
        super.replaceAll(operator);
    }
}

