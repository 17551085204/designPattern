/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2020/12/15
*/

package designModel.behaviortype.observer.improve;
//import java.util.Scanner;

public class Baidu implements Observer {
    // 温度，气压，湿度
    private double temperature;
    private double pressure;
    private double humidity;

    @Override
    //更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("来自百度官网");
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }

}
