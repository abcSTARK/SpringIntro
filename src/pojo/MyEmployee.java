package pojo;

import java.util.Objects;

public class MyEmployee {
    private int empID;
    private String empName;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public MyEmployee() {
        System.out.println("Default const.");
    }

    public MyEmployee(int empID, String empName) {
        System.out.println("Param const.");
        this.empID = empID;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "MyEmployee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEmployee that = (MyEmployee) o;
        return empID == that.empID && Objects.equals(empName, that.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID, empName);
    }
}
