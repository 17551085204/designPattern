/*
 * @Author hdk
 * @QQ:2890241339
 **/
package principle.inversion.demo.demo1;
// 依赖倒转原则的实例
public class InversionPrincipleDemo1 {
    public static void main(String[] args) {
        // 第一种方法，利用接口
        // 创建一个电视
        XiaoMi xiaoMi = new XiaoMi();
        Honor honor = new Honor();
        // 创建一个电视开关
        Openandclose openandclose = new Openandclose();
        // 打开电视
        openandclose.open(xiaoMi);
        openandclose.open(honor);

    }
}


// 开关类，实现了接口
class Openandclose implements Iopenandclose {
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}

//控制电视的开关
interface Iopenandclose{
    void open(ITV itv);
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