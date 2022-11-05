package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.models.Car;
import ge.tbc.testautomation.util.HelperFunction;

public class Runner {
    public static void main(String[] args) {
        Car.setCountry("Germany");
        Car mercedes = new Car("Mercedes");
        mercedes.setBrand("mercedes");
        Car audi = new Car("Audi");
//        Car opel = new Car();

        System.out.println(HelperFunction.carToString(audi));


        //

    }
//        opel.setBrand("Opel");
//
//        mercedes.invokeGetInformation();
//        audi.getInformation();
    }
