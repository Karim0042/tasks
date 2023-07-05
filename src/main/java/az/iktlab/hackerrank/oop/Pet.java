package az.iktlab.hackerrank.oop;

import java.util.Arrays;

public class Pet {


    public String species;
    public String nickName;
    public int age;
    public int trickLevel;
    public String[] habits;

    public Pet(){}

    public Pet(String nickName){
        this.nickName=nickName;
    }

    public Pet(String species, String nickName, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(){
        System.out.println("Helo owner. I am -"+this.nickName+"."+" I miss you!");
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {

        return "Pet{" +
                "species='" + species + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';

    }
}