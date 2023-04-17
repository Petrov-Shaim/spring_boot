package petrov.springboot.spring_boot.service;

import petrov.springboot.spring_boot.entity.User;

import java.util.List;

public interface EmployeeService {
    public List<User> getAllEmployees();
    public void saveEmployee(User employee);
    public User getEmployee(int id);
    public void deleteEmployee(int id);
}
