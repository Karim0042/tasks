package az.iktlab.minifamily.bean;

import az.iktlab.minifamily.animals.Pet;
import az.iktlab.minifamily.inter.HumanCreator;

import java.util.*;

public class Family implements HumanCreator {

    private Set<Pet> pets;

    private Human mother;
    private Human father;
    private List<Human> children=new ArrayList<>();




    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;

    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void addChild(Human child) {
       children.add(child);
    }

    public void deleteChildByIndex(int index) {
       children.remove(index);
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
        int amountOfMembers = children.size();
        if (father != null)
            amountOfMembers++;
        if (mother != null)
            amountOfMembers++;
        return amountOfMembers;
    }

    @Override
    public String toString() {
        return "Family{" +
                "pets=" + pets +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is removing");
    }
    @Override
    public void bornChild() {
        Random rnd = new Random();
        String[] arrayOfMan = {"aydin", "zakir", "kerim", "rasim", "xeyal"};
        String[] arrayOfWoman = {"aysun", "aysel", "zehra", "sara"};

        boolean isMale = rnd.nextBoolean();

        Human child = isMale ? new Man():new Woman();
        String name = isMale ? arrayOfMan[rnd.nextInt(arrayOfMan.length)]: arrayOfWoman[rnd.nextInt(arrayOfWoman.length)];
        child.setName(name);
        this.addChild(child);
        child.setIq((this.father.getIq() + this.mother.getIq()) / 2);
    }
}