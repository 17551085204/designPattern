/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.behaviortype.visitor;

public class Wait extends Action {


    @Override
    public void getManResult(Man man) {
        System.out.println("男人的评价，wait");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人的评价，wait");
    }
}
