/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.facade;
//import java.util.Scanner;

public class DVDplayer {
    private static DVDplayer instance=new DVDplayer();
    public static DVDplayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd打开");
    }
    public void off(){
        System.out.println("dvd关闭");
    }
    public void play(){
        System.out.println("dvd正在播放");
    }
    public void pause(){
        System.out.println("dvd暂停");
    }

}
