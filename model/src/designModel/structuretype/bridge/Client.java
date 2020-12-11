/*
 * @Author hdk
 * @QQ:2890241339
 **/
package designModel.structuretype.bridge;

public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone_xiaomi = new FoldedPhone(new XiaoMi());
        foldedPhone_xiaomi.open();
        System.out.println("-----------------------");
        UpRightPhone upRightPhone_vivo = new UpRightPhone(new Vivo());
        upRightPhone_vivo.open();
        System.out.println("------------");
        FoldedPhone foldedPhone_huawei = new FoldedPhone(new Huawei());
        foldedPhone_huawei.call();
        System.out.println("------------");
        SlidingPhone slidingPhone_xiaomi = new SlidingPhone(new XiaoMi());
        slidingPhone_xiaomi.close();



    }
}
