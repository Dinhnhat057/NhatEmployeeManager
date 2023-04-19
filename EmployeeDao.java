/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeManagent;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 84905
 */
public class EmployeeDao {
    List<Employee> lsEm = new ArrayList<>();
    public int add(Employee e){
        lsEm.add(e);
        return 1;
        
    }
    public int count(){
        return lsEm.size();
    }
}
