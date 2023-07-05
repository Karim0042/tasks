package az.iktlab.hackerrank.oop;

import java.util.Arrays;
import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;

    public Human mother ;
    public Human father ;

    public String[][] schedule;

    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello" + pet.nickName);
    }

    public void describePet() {

        System.out.print("Info about Pet " + ":" + "I have a" + pet.species + ",he is " + pet.age + "years old ,he is");

        if (pet.trickLevel >= 50) {
            System.out.print(" very sly");
        } else {
            System.out.println(" almost not sly.");
        }


    }

    public boolean feedPet(boolean b) {
        if (!b) {
            Random random = new Random();

            int randomNumber = random.nextInt(101);

            if (this.pet.trickLevel > randomNumber) {
                feedPet(true);
                return true;
            }

            System.out.printf("I think %s is not hungry\n", this.name);

            return false;
        }

        System.out.printf("Hm... I will feed %s's %s\n", this.name, this.pet.nickName);
        return true;
    }

    @Override
    public String toString() {

        if(mother==null || father==null){
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + year +
                    ", iq=" + iq +
                    ", pet=" + pet +
                    ", mother=" +null+
                    ", father=" +null+
                    ", schedule=" + Arrays.toString(schedule) +
                    '}';
        }

        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother.name +
                ", father=" + father.name +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}