package com.Neoflex.calc.contoller;

import com.Neoflex.calc.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalcController {

    @Autowired
    private CalcService calcService;

    @GetMapping("sum/{number1}/{number2}")
    public String getSum(@PathVariable String number1, @PathVariable String number2) {
        return calcService.getSum(number1, number2);
    }

    @GetMapping("sub/{number1}/{number2}")
    public int getSubtraction(@PathVariable int number1, @PathVariable int number2) {
        return calcService.getSubtraction(number1, number2);
    }

    @GetMapping("div")
    public String getDivision(@RequestParam int number1, @RequestParam int number2) {
            return calcService.getDivision(number1, number2);
    }

    @GetMapping("Mult")
    public int getMultiplication(@RequestParam int number1, @RequestParam int number2) {
        return calcService.getMultiplication(number1, number2);
    }

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> message (ArithmeticException e) {
        return ResponseEntity.badRequest().body("На ноль делить нельзя");
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> message (NumberFormatException e) {
        return ResponseEntity.badRequest().body("Вводите только цифры");
    }
}
