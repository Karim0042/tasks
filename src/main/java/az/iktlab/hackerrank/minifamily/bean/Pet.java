package az.iktlab.hackerrank.minifamily.bean;

import az.iktlab.hackerrank.minifamily.enums.Species;

import java.util.Arrays;

public abstract class Pet {


    public Species species;
    public String nickName;
    public int age;
    public int trickLevel;
    public String[] habits;

    public Pet(){}

    public Pet(String nickName){
        this.nickName=nickName;
    }

    public Pet(Species species, String nickName, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public abstract void respond();
    public void eat(){
        System.out.println("I am eating");
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    /*@Override
    protected void finalize() throws Throwable {
        System.out.println("object is removing");
    }*/




    @Override
    public String toString() {

        return "Pet{" +
                "iscanfly'" + species.isCanFly() + '\'' +"" +
                "numberOfLegs = "+ species.getNumberOfLegs() + '\'' +""+
                "isFur = "+ species.isHasFur() + '\'' +""+
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';

    }
}