package pojo;

import java.util.Objects;

public class Department {
    private int deptID;
    private String deptName;
    private MyEmployee emp;

    public Department() {
    }

    public Department(int deptID, String deptName, MyEmployee emp) {
        this.deptID = deptID;
        this.deptName = deptName;
        this.emp = emp;
    }

    public Department(int deptID, String deptName) {
        this.deptID = deptID;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptID=" + deptID +
                ", depName='" + deptName + '\'' +
                ", emp=" + emp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return deptID == that.deptID && Objects.equals(deptName, that.deptName) && Objects.equals(emp, that.emp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptID, deptName, emp);
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getDepName() {
        return deptName;
    }

    public void setDepName(String depName) {
        this.deptName = depName;
    }

    public MyEmployee getEmp() {
        return emp;
    }

    public void setEmp(MyEmployee emp) {
        this.emp = emp;
    }
}
