package az.iktlab.hackerrank.oop;

import java.util.Arrays;
import java.util.Objects;

public  class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    public String[][] schedule = new String[7][2];

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
    @Override
    public void finalize() throws Throwable {
        System.out.println("object is removing");
    }
    public void name(){
        int i=0;
        for (DayOfWeek dayOfWeek:DayOfWeek.values()) {
            this.schedule[i][0] = dayOfWeek.name();
            this.schedule[i][1] = "task_"+i;
        }
    }
}
