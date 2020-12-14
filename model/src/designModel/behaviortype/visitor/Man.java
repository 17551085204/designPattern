/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.behaviortype.visitor;

public class Man extends Person{

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
