/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.facade;
//import java.util.Scanner;

public class Popcorn {
    private static Popcorn instance=new Popcorn();
    public static Popcorn getInstance(){
        return instance;
    }
    public void on(){
        System.out.println("popcorn打开");
    }
    public void off(){
        System.out.println("popcorn关闭");
    }
    public void pop(){
        System.out.println("popcorn is poping");
    }


}
