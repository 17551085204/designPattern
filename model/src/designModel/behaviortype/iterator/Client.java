/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/14
*/

package designModel.behaviortype.iterator;
//import java.util.Scanner;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
       ComputerCollege computerCollege = new ComputerCollege();
       InfoCollege infoCollege = new InfoCollege();
       colleges.add(computerCollege);
       colleges.add(infoCollege);
       OutputImpl output = new OutputImpl(colleges);
       output.printCollege();

    }

}
