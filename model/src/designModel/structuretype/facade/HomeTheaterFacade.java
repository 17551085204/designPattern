/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/12
*/

package designModel.structuretype.facade;
//import java.util.Scanner;

import designModel.creationtype.build.improve.HouseDirector;

import java.util.Properties;

public class HomeTheaterFacade {
    // 各个子系统对象
    private Light light;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDplayer dvDplayer;

    public HomeTheaterFacade() {
        this.light = Light.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvDplayer = DVDplayer.getInstance();
    }

    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvDplayer.on();
        light.dim();

    }
    public void play(){
        dvDplayer.play();
    }
    public void pause(){
        dvDplayer.pause();
    }

    public void end(){
        popcorn.off();
        light.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvDplayer.off();

    }





}
