package az.iktlab.hackerrank;

public class Prsn {
    public String name;
    public String surname;
    public int age;
    public String gender;
    public String birthdate;

    public Prsn() {
    }

    public Prsn(String name, String surname, int age, String gender, String birthdate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Prsn{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
