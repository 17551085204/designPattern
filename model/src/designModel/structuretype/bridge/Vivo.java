/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.structuretype.bridge;

public class Vivo implements Brand {

    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话");
    }
}
