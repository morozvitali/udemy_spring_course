
package lilpractice.sorting_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.grade - o.grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("John", 20, 15));
        students.add(new Student("Jane", 21, 3));
        students.add(new Student("Jack", 22, 18));
        students.add(new Student("Jill", 23, 9));
        students.add(new Student("Bob", 24, 5));

        System.out.println(students);
        //Collections.sort(students);
        //students.sort(Comparator.comparing(Student::getName));
        students.sort((s1, s2) -> Integer.compare(s2.getAge(), s1.getAge()));


        System.out.println(students);


    }
}