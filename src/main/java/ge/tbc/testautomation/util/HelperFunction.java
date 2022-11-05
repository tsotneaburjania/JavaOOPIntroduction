package ge.tbc.testautomation.util;

import ge.tbc.testautomation.models.Car;

public class HelperFunction {
    public static String carToString(Car car){
        System.out.println("HEY");
        return "[CAR: BRAND - " + car.getBrand() + "]";
    }
}
