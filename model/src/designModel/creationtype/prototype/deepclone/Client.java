package designModel.creationtype.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DeepProtoType p = new DeepProtoType();
		p.name = "jack";
		p.deepCloneableTarget = new DeepCloneableTarget("tom", "class");

		//采用重写的clone方法
//		DeepProtoType p2 = (DeepProtoType) p.clone();
//		System.out.println("p.name=" + p.name + ",    p.deepCloneableTarget.hashcode=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + ",   p2.deepCloneableTarget.hashcode=" + p2.deepCloneableTarget.hashCode());
	
        // 采用序列化和反序列化实现deepclone
		DeepProtoType p2 = (DeepProtoType) p.deepClone();
		System.out.println("p.name=" + p.name + ",   p.deepCloneableTarget.hashcode=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + ",   p2.deepCloneableTarget.hashcode=" + p2.deepCloneableTarget.hashCode());
	
	}

}
