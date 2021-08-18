package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Group {
    @Value(value="300")
    private int groupId;
    @Autowired
    @Qualifier(value="mystu")
    private Student student1;

    public Group(int groupId, Student student) {
        this.groupId = groupId;
        this.student1 = student;
    }

    public Group() {
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Student getStudent() {
        return student1;
    }

    public void setStudent(Student student) {
        this.student1 = student;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", student=" + student1 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupId == group.groupId && Objects.equals(student1, group.student1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, student1);
    }
}
