/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/16
*/

package designModel.behaviortype.strategy.improve;
//import java.util.Scanner;

public class PekingDuck extends Duck {

    @Override
    public void display() {
        System.out.println("北京鸭子");
    }

    public PekingDuck() {
        flyBehavior=new NoFlyBehavior();
        quarkBehavior=new GagaQuarkBehavior();
    }
}
