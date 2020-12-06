package principle.singleresponsibility;
// 单一职责原则



public class SingleResponsibility1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.run("飞机");
		vehicle.run("汽车");
		vehicle.run("火车");
	}

}



// 定义一个交通工具类
// run方法违反单一职责原则
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上跑");
	}
}
