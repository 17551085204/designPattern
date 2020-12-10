package designModel.structuretype.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		
		AbsAdapter absAdapter = new AbsAdapter() {
			//ֻ��Ҫȥ�������� ��Ҫʹ�� �ӿڷ���
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("重写了m1方法");
			}
		};
		
		absAdapter.m1();
	}
}
