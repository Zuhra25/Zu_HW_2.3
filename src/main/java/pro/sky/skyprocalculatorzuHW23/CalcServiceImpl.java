package pro.sky.skyprocalculatorzuHW23;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int arg1, int arg2) {
        return String.format("%d + %d = %d", arg1, arg2, arg1 + arg2);
    }

    public String minus(int arg1, int arg2) {
        return String.format("%d - %d = %d", arg1, arg2, arg1 - arg2);
    }

    public String multiply(int arg1, int arg2) {
        return String.format("%d * %d = %d", arg1, arg2, arg1 * arg2);
    }

    public String divide(int arg1, int arg2) {
        if (arg2 == 0) {
            return String.format("Делить на ноль нельзя!!!");
        } else {
            return String.format("%d / %d = %.1f", arg1, arg2, (double) arg1 / arg2);
        }
    }

}


