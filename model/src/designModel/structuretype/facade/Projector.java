/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.facade;
//import java.util.Scanner;

public class Projector {
    private static Projector instance=new Projector();
    public static Projector getInstance(){
        return instance;
    }
    public void on(){
        System.out.println("Projector打开");
    }
    public void off(){
        System.out.println("Projector关闭");
    }

    public void focus(){
        System.out.println("Projector is focusing");
    }

}
