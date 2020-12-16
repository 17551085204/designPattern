/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/16
*/

package designModel.behaviortype.strategy;
//import java.util.Scanner;

public abstract class Duck {

    public void quark(){
        System.out.println("鸭子嘎嘎叫");
    }
    public void swing(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        System.out.println("鸭子会飞翔");
    }

    public abstract void display();// 显示鸭子信息

    public Duck() {

    }
}
