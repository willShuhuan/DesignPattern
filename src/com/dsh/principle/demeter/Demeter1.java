package com.dsh.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DSH
 * @date 2020/5/12
 * @description 不使用迪米特法则
 */
//客户端
public class Demeter1 {
    public static void main(String[] args) {
        CollegeManage manage = new CollegeManage();
        SchoolManage schoolManage = new SchoolManage();
        schoolManage.printAllEmployee(manage);
    }
}

//总部雇员
class Employee{
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//分院雇员
class CollegeEmployee{
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院员工管理类
class CollegeManage{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id="+i);
            list.add(employee);
        }
        return list;
    }
}

//学校管理类 总部员工
//直接朋友 Employee ，CollegeManage
//不是直接朋友 CollegeEmployee
class SchoolManage{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学院总部员工id="+i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmployee(CollegeManage sub){
        //1 CollegeEmployee不是SchoolManage的直接朋友
        //2 CollegeEmployee是以局部变量的方式出现在SchoolManage
        //3 违反了迪米特原则
        List<CollegeEmployee> collegeList = sub.getAllEmployee();
        System.out.println("----------分院员工---------");
        for (CollegeEmployee employee:collegeList){
            System.out.println(employee.getId());
        }
        List<Employee> schoolList = this.getAllEmployee();
        System.out.println("----------学校总部员工---------");
        for (Employee employee:schoolList){
            System.out.println(employee.getId());
        }
    }
}
