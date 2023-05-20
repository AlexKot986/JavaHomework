package com.example.seminar6.Ex5;

public class Converter {

    public class FahrenheitConverter implements Converter {
        @Override
        public double convertValue(double grad){
            return grad * 9 / 5 + 32;
        }
    }

21:06
    public class KelvinConverter implements Converter {
        @Override
        public double convertValue(double grad){

            return grad - 273.15D;
        }
    }

21:06
    public interface Converter {
        public double convertValue(double grad);
    }

21:06
    double gradus = 36.6D;

    FahrenheitConverter far = new FahrenheitConverter();
        System.out.println(far.convertValue(gradus));

    KelvinConverter kel = new KelvinConverter();
        System.out.println(kel.convertValue(gradus));


}
