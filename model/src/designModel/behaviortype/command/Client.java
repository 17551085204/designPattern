/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.behaviortype.command;
//import java.util.Scanner;

import designModel.structuretype.facade.Light;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        remoteController.onButtonPush(0);
        remoteController.offButtonPush(0);
//        remoteController.undoButtonPush();
        System.out.println("-----------------");
        remoteController.onButtonPush(1);
        remoteController.offButtonPush(1);
//        remoteController.undoButtonPush();


    }




}
