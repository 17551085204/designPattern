/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/14
*/

package designModel.behaviortype.iterator;
//import java.util.Scanner;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 遍历所有学院
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            // 取出一个学院
            College college = iterator.next();
            System.out.println("----------"+college.getName()+"------------");
            // 得到对应的迭代器
            printDepartment(college.createIterator());
        }

    }


    // 输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d=(Department)iterator.next();
            System.out.println(d.getName());
        }

    }


}
