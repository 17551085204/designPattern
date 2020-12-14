/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.behaviortype.visitor;
// 使用到了双分派，首先在客户端程序中，将具体状态作为参数
// 传递到Woman,然后Woman类调用作为参数的“具体方法”
// 同时将this作为参数传入，完成了第二次的分派

public class Woman extends Person {

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
