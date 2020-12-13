/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.behaviortype.command;
//import java.util.Scanner;

public class LightOnCommand  implements Command{
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
