package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;
@Component(value="mystu")
public class Student {
    @Value(value="100")
    private int rollNo;
    @Value(value="name123")
    private String name;

    public Student() {
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
}
