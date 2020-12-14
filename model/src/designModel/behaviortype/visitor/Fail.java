/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.behaviortype.visitor;

public class Fail extends Action{

    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是失败");
    }
}
