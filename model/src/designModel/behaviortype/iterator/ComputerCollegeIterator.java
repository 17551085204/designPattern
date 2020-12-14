/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/14
*/

package designModel.behaviortype.iterator;
//import java.util.Scanner;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    // 需要知道department是以怎样的方式存放
    Department[]departments;
    int position=0;// 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        // 数组的判断方式
        if(position>=departments.length|| departments[position]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    // 默认空实现
    public void remove(){

    }


}
