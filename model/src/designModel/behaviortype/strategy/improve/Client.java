/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/16
*/

package designModel.behaviortype.strategy.improve;
//import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        Duck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.quark();
        Duck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.quark();
        wildDuck.setFlyBehavior(new BadFlyBehavior());
        wildDuck.setQuarkBehavior(new NoQuarkBehavior());
        wildDuck.fly();
        wildDuck.quark();


    }




}
