/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.behaviortype.command;
//import java.util.Scanner;

public class RemoteController {
    Command[]onCommands;
    Command[]offCommands;
    Command undoCommand;

    public RemoteController() {
        onCommands=new Command[5];
        offCommands=new Command[5];
        for (int i = 0; i <5 ; i++) {
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }

    }
    // 给按钮设置需要的命令
    public void setCommand(int num,Command onCommand,Command offCommand){
        onCommands[num]=onCommand;
        offCommands[num]=offCommand;

    }

    // 执行按下开的按钮
    public void onButtonPush(int num){
        onCommands[num].execute();
        // 记录这次的操作，用于撤销
        undoCommand=onCommands[num];

    }
    // 执行按下关的按钮
    public void offButtonPush(int num){
        offCommands[num].execute();
        // 记录这次的操作，用于撤销
        undoCommand=offCommands[num];

    }

    public void undoButtonPush(){
        undoCommand.undo();
    }



}
