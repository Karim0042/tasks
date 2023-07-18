package az.iktlab.hackerrank.oop;

import java.util.Arrays;
import java.util.Random;

public class Family {

    private Pet pet;

    private Human mother;
    private Human father;
    private Human[] children;




    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;

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

            System.out.printf("I think %s is not hungry\n", this.pet.nickName);

            return false;
        }

        System.out.printf("Hm... I will feed %s's %s\n", this.pet.nickName);
        return true;
    }

    public void addChild(Human child) {
        int size;
        if (this.children == null) {
          size = 0;
        }else {
           size = this.children.length;
        }
        Human[] newArr = new Human[size + 1];
        for (int i = 0; i < size; i++) {
            newArr[i] = this.children[i];
        }
        newArr[size] = child;
        this.children = newArr;
    }

    public void deleteChildByIndex(int index) {
        Human[] newArr = new Human[this.children.length - 1];
        int d = 0;
        for (int i = 0; i < this.children.length; i++) {
            if (i != index) {
                newArr[d] = this.children[i];
                d++;
            }
        }
        this.children = newArr;
    }

    public void deleteChild(Human child) {
        int index = 0;
        for (Human h : this.children) {
            if (h.equals(child) || h.hashCode() == child.hashCode()) {
                deleteChildByIndex(index);
            }
            index++;
        }

    }

    public int countFamily() {
        return 2 + this.children.length;
    }

    @Override
    public String toString() {
        return "Family{" +
                "pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is removing");
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}