/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.composite;
//import java.util.Scanner;

public  abstract class OrganizationComponent {
   private  String name;
   private  String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public void add(OrganizationComponent organizationComponent){
       // 默认实现
       throw new UnsupportedOperationException();
   }

    public void remove(OrganizationComponent organizationComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // 打印方法
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
