/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/16
*/

package designModel.behaviortype.strategy.improve;
//import java.util.Scanner;

public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不能飞行");
    }
}
