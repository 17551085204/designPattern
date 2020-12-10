/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.structuretype.adapter.classadapter;
//import java.util.Scanner;

public class VolAdapter extends Vol220V implements  Vol5V {

    @Override
    public int output5V() {
        int src=output220v();
        int dst=src/44;
        return dst;
    }
}
