/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/13
*/

package designModel.behaviortype.command;
//import java.util.Scanner;

public class TVOnCommand  implements Command{
    TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }


    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }

}
