package EmployeeImportance690;

import java.util.List;

public class EmployeeImportance690 {
}



class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};


class Solution {
    public Employee get(List<Employee> employees, int id){
        for(int i =0; i < employees.size(); i++){
            if(employees.get(i).id == id) return employees.get(i);
        }
        return null;
    }
    public int getImportance(List<Employee> employees, int id) {
        Employee employee = get(employees,id );
        int result = helper(employees,id,0);
        return  result;

    }
    public int helper(List<Employee> employees,int id,int res){
        Employee employee = get(employees, id);
        res += employee.importance;
        List<Integer> lst = employee.subordinates;
        if(lst == null || lst.size() == 0) return  res;
        for(int i = 0; i < lst.size(); i++){
            res = helper(employees,lst.get(i),res);
        }
        return res;
    }
}