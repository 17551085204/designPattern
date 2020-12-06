/*
 * @Author hdk
 * @QQ:2890241339
 **/
package my202012.inversion;

public class ReceiveInfo {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new WeiXin());
        person.receive(new QQ());

    }
}

class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }

}

class WeiXin implements IReceiver{
    @Override
    public String getInfo() {
        return "微信消息";
    }
}

class QQ implements IReceiver{
    @Override
    public String getInfo() {
        return "QQ消息";
    }
}

interface IReceiver{
    String getInfo();
}


