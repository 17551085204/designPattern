/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/14
*/

package designModel.behaviortype.iterator;
//import java.util.Scanner;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[]departments;
    int numOfDepartment=0;// 保存当前数组的对象个数

    public ComputerCollege() {
        departments=new Department[5];
        addDepartment("java","java");
        addDepartment("php","php");
        addDepartment("大数据","大数据");

    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment]=department;
        numOfDepartment++;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
