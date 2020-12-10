/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.creationtype.prototype.improve;
//import java.util.Scanner;

public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address="蒙古羊";
    public Sheep friend;


    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 克隆该实例，使用默认的克隆方法
    @Override
    protected Object clone()  {
        Sheep sheep=null;
        try {
            sheep=(Sheep)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
