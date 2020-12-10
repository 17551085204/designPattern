/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/10
*/

package designModel.structuretype.adapter.objadapter;
//import java.util.Scanner;

public class VolAdapter  implements Vol5V {

    Vol220V vol220V;
    public VolAdapter(Vol220V vol220V) {
        this.vol220V = vol220V;
    }

    @Override
    public int output5V() {
        int dst=0;
        int src=0;
        if(this.vol220V!=null){
            src=this.vol220V.output220v();
            System.out.println("使用对象适配器");
            dst=src/44;
            System.out.println("适配完成，输出的电压为"+dst);
        }

        return dst;
    }
}
