package az.iktlab.minifamily.bean;

import az.iktlab.minifamily.enums.DayOfWeek;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public  class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    public Map<DayOfWeek,String>schedule;
    public Human(){}
    public Human(String name,String surname,int year,int iq,Map<DayOfWeek,String>schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq =iq;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && name.equals(human.name) && surname.equals(human.surname) ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("object is removing");
    }
    public void name(){
        int i=0;
        for (DayOfWeek dayOfWeek:DayOfWeek.values()) {

        }
    }
}
