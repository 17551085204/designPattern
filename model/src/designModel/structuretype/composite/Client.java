/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.composite;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // 创建一个大学
        OrganizationComponent university = new University("清华大学", "清华大学");
        // 创建一个学院
        OrganizationComponent college1 = new College("计算机学院", "计算机学院");
        // 创建3个专业
        Department department1 = new Department("计算机学院专业1", "计算机学院专业1");
        Department department2 = new Department("计算机学院专业2", "计算机学院专业2");
        Department department3 = new Department("计算机学院专业3", "计算机学院专业3");
        // 专业加入学院
        college1.add(department1);college1.add(department2);college1.add(department3);
        // 再创建一个学院
        OrganizationComponent college2 = new College("信息学院", "信息学院");
        // 再创建3个专业
        Department department11 = new Department("信息学院专业1", "信息学院专业1");
        Department department22 = new Department("信息学院专业2", "信息学院专业2");
        Department department33 = new Department("信息学院专业3", "信息学院专业3");
        // 专业加入学院
        college2.add(department11);college2.add(department22);college2.add(department33);
        // 学院加入大学
        university.add(college1); university.add(college2);

        // 打印测试
//        university.print();
        college1.print();


    }

}
