/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.structuretype.adapter.classadapter;
//import java.util.Scanner;

public class Phone {
   public void charging(Vol5V vol5V){
       if(vol5V.output5V()==5){
           System.out.println("电压5V，开始充电");
       }else if(vol5V.output5V()>5){
           System.out.println("电压大于5V，不能充电");
       }

   }

}
