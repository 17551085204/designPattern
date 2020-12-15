/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/15
*/

package designModel.behaviortype.observer.improve;
//import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        // 定义观察者
        Observer currentConditions = new CurrentConditions();
        Observer  baidu = new Baidu();
        // 观察者注册
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baidu);
//        weatherData.removeObserver(baidu);

        // 更新所有的 观察者的数据
        weatherData.setData(12,13,15);


    }




}
