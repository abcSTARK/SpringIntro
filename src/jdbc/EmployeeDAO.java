package jdbc;

import java.util.List;

public interface EmployeeDAO {

    public int addEmployee(Employee employee);
    public boolean upadteEmployee(int empId,String address);
    public Employee findById(int empId);
    public List<Employee> findAllEmployees();



}
