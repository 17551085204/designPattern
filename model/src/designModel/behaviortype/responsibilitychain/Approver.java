/*
 * @Author hdk
 * @QQ:2890241339
 * @Date 2020/12/17 0017
 **/
package designModel.behaviortype.responsibilitychain;

public abstract class Approver {
   Approver approver;// 下一个处理者
   String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    // 处理审批请求的方法
    public abstract void processRequest(PurchaseRequest purchaseRequest);


}
