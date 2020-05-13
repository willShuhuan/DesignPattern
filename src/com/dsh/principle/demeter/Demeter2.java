package com.dsh.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DSH
 * @date 2020/5/12
 * @description 迪米特法则改进
 */
//客户端
public class Demeter2 {
    public static void main(String[] args) {
        CollegeManage2 manage = new CollegeManage2();
        SchoolManage2 schoolManage = new SchoolManage2();
        schoolManage.printAllEmployee(manage);
    }
}

//总部雇员
class Employee2{
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//分院雇员
class CollegeEmployee2{
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院员工管理类
class CollegeManage2{
    public List<CollegeEmployee2> getAllEmployee(){
        List<CollegeEmployee2> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee2 employee = new CollegeEmployee2();
            employee.setId("学院员工id="+i);
            list.add(employee);
        }
        return list;
    }

    public void printEmplyee(){
        List<CollegeEmployee2> collegeList = this.getAllEmployee();
        System.out.println("----------分院员工---------");
        for (CollegeEmployee2 employee:collegeList){
            System.out.println(employee.getId());
        }
    }
}

//学校管理类 总部员工
//直接朋友 Employee ，CollegeManage
//不是直接朋友 CollegeEmployee
class SchoolManage2{
    public List<Employee2> getAllEmployee(){
        List<Employee2> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee2 employee = new Employee2();
            employee.setId("学院总部员工id="+i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmployee(CollegeManage2 sub){
        sub.printEmplyee();
        List<Employee2> schoolList = this.getAllEmployee();
        System.out.println("----------学校总部员工---------");
        for (Employee2 employee:schoolList){
            System.out.println(employee.getId());
        }
    }
}
