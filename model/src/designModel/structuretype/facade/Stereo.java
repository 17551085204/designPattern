/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.facade;
//import java.util.Scanner;

public class Stereo {
    private static Stereo instance=new Stereo();
    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("立体声打开");
    }
    public void off(){
        System.out.println("立体声关闭");
    }

    public void up(){
        System.out.println("立体声开大");
    }


}
