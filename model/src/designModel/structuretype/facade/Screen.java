/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.facade;
//import java.util.Scanner;

public class Screen {
    private static Screen instance=new Screen();
    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("屏幕上升");
    }
    public void down(){
        System.out.println("屏幕下降");
    }

}
