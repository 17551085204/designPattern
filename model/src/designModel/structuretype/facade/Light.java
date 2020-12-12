/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.facade;
//import java.util.Scanner;

public class Light {
    private static Light instance=new Light();
    public static Light getInstance(){
        return instance;
    }
    public void on(){
        System.out.println("灯光打开");
    }
    public void off(){
        System.out.println("灯光关闭");
    }

    public void dim(){
        System.out.println("灯光调暗");
    }
    public void bright(){
        System.out.println("灯光调亮");
    }



}
