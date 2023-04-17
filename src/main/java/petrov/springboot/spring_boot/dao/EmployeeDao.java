package petrov.springboot.spring_boot.dao;


import petrov.springboot.spring_boot.entity.User;

import java.util.List;

public interface EmployeeDao {
    public List<User> getAllEmployees();

    void saveEmployee(User employee);

    public User getEmployee(int id);

    public void deleteEmployee(int id);
}
