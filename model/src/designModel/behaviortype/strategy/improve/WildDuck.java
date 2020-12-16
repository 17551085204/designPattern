/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/16
*/

package designModel.behaviortype.strategy.improve;
//import java.util.Scanner;

public class WildDuck extends Duck {

    public WildDuck( ) {
        flyBehavior=new GoodFlyBehavior();
        quarkBehavior=new GegeQuarkBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }

}
