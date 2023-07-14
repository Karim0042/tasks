package az.iktlab.hackerrank.oop;

import java.util.Arrays;
import java.util.Objects;

public  class Human {
    private String name="name";
    private String surname="surname";
    private int year=0;
    private int iq=0;
    public String[][] schedule={{"day", "task"}, {"day_2", "task_2"}};

    public Human(String name,String surname,int year,int iq,String[][]schedule) {
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
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && name.equals(human.name) && surname.equals(human.surname) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}
