/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.behaviortype.template;
//import java.util.Scanner;

public abstract class SoyMilk {
   final void make(){
        select();
        if(custumerWantCondiments()){
            add();
        }
        soak();
        beat();

   }

   // 钩子方法，决定是否需要添加配料
    boolean custumerWantCondiments(){
       return true;
    }


   void select(){
       System.out.println("选择新鲜的豆浆");
   }

   abstract void add();

    void soak(){
        System.out.println("浸泡3h");
    }

    void beat(){
        System.out.println("打豆浆");
    }

}
