/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.creationtype.singleton.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);

    }

}

// 使用枚举，可以实现单例模式

/**
 * 优缺点说明：
 *
 * 1)这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 2)这种方式是 Effective Java 作者 Josh Bloch  提倡的方式
 * 3)结论：推荐使用
 *
 */

enum Singleton{
  INSTANCE;
  public void sayOK(){
      System.out.println("ok");
  }

}



