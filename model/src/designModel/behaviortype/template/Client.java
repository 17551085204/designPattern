/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.behaviortype.template;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        SoyMilk blackBeanSoyMilk = new BlackBeanSoyMilk();
        blackBeanSoyMilk.make();
        System.out.println("---------------------");
        SoyMilk peannutSoyMilk = new PeannutSoyMilk();
        peannutSoyMilk.make();
        System.out.println("---------------------");
        SoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();


    }

}
