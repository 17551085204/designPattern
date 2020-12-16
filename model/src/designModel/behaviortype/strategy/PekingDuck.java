/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/16
*/

package designModel.behaviortype.strategy;
//import java.util.Scanner;

public class PekingDuck extends Duck {

    @Override
    public void display() {
        System.out.println("北京鸭子");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭子不能飞");
    }
}
