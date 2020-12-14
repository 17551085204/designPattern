/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/14
*/

package designModel.behaviortype.iterator;
//import java.util.Scanner;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    // 需要知道department是以怎样的方式存放
    List<Department>departmentList;
    int index=-1;// 遍历的位置

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index>=departmentList.size()-1){
            return false;
        }else{
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    // 默认空实现
    public void remove(){

    }


}
