package com.Neoflex.calc.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class CalcService {

    public String getSum(String number1,  String number2) {
            int numb1 = Integer.parseInt(number1);
            int numb2 = Integer.parseInt(number2);
            return String.valueOf(numb1+numb2);
    }

    public int getSubtraction(int number1, int number2) {
        return number1 - number2;
    }

    public String getDivision(int number1, int number2) {
            return String.valueOf((double) number1 / number2);
    }

    public int getMultiplication(int number1, int number2) {
        return number1 * number2;
    }
}
