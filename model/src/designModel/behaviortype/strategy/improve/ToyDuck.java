/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/16
*/

package designModel.behaviortype.strategy.improve;
//import java.util.Scanner;

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior=new NoFlyBehavior();
        quarkBehavior=new NoQuarkBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭子");
    }

    @Override
    public void quark() {
        System.out.println("玩具鸭子不能叫");
    }


    @Override
    public void swing() {
        System.out.println("玩具鸭子不能游泳");
    }
}
