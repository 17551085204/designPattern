/*
 * @Author hdk
 * @QQ:2890241339
 **/
package principle.inversion.demo.demo3;
// 依赖倒转原则的实例
public class InversionPrincipleDemo3 {
    public static void main(String[] args) {
        //第三种方法，通过setter方法进行依赖传递
        Openandclose openandclose = new Openandclose();
        openandclose.setITV(new XiaoMi());
        openandclose.open();
        openandclose.setITV(new Honor());
        openandclose.open();

    }
}


// 开关类，通过setter方法依赖
class Openandclose  {
    ITV itv;
    public void setITV(ITV itv) {
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