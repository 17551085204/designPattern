/*
 * @Author hdk
 * @QQ:2890241339
 **/
package principle.inversion.demo.demo2;
// 依赖倒转原则的实例
public class InversionPrincipleDemo2 {
    public static void main(String[] args) {
        //第二种方法，通过构造器进行依赖传递
        Openandclose openandclose = new Openandclose(new XiaoMi());
        openandclose.open();
        openandclose = new Openandclose(new Honor());
        openandclose.open();


    }
}


// 开关类，通过构造器依赖
class Openandclose  {
    ITV itv;
    public Openandclose(ITV itv) {
        this.itv=itv;
    }
    public void open(){
        itv.play();
    }

}

// 具体的电视类
class XiaoMi implements ITV {
    @Override
    public void play() {
        System.out.println("小米电视开始播放");
    }
}

class Honor implements ITV {
    @Override
    public void play() {
        System.out.println("荣耀电视开始播放");
    }
}

// 电视接口
interface ITV{
    void play();
}