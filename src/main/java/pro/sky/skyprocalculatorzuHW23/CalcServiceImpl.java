package pro.sky.skyprocalculatorzuHW23;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public double divide(int arg1, int arg2) {
            return (double) arg1 / arg2;
    }

}


