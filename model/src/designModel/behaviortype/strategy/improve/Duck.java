/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/16
*/

package designModel.behaviortype.strategy.improve;
//import java.util.Scanner;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuarkBehavior quarkBehavior;

    public void setQuarkBehavior(QuarkBehavior quarkBehavior) {
        this.quarkBehavior = quarkBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void swing(){
        System.out.println("所有鸭子都会游泳");
    }

    public void quark(){
        if(quarkBehavior!=null){
            quarkBehavior.quark();
        }
    }


    public void fly(){
        if(flyBehavior!=null){
            flyBehavior.fly();
        }
    }

    public abstract void display();// 显示鸭子信息

    public Duck() {

    }
}
