//package com.Neoflex.calc.contoller;

//import org.springframework.web.bind.annotation.*;

//@RestController
//public class CalcController {

// @GetMapping("sum/{number1}/{number2}")
//    public String getSum(@PathVariable String number1, @PathVariable String number2) {
//       try {
//           int numb1 = Integer.parseInt(number1);
//           int numb2 = Integer.parseInt(number2);
//           return String.valueOf(numb1+numb2);
//       }
//       catch (NumberFormatException e) {
//           return "Вы ввели неккоректные данные";
//       }
//    }
//
//    @GetMapping("sub/{number1}/{number2}")
//    public int getSubtraction(@PathVariable int number1, @PathVariable int number2) {
//        return number1 - number2;
//    }
//
//    @GetMapping("div")
//    public String getDivision(@RequestParam int number1, @RequestParam int number2) {
//
//        try {
//            String result = String.valueOf((float) number1 / number2);
//            return result;
//        } catch (ArithmeticException e) {
//            return "На 0 делить нельзя";
//        }
//    }
//
//    @GetMapping("Mult")
//    public int getMultiplication(@RequestParam int number1, @RequestParam int number2, boolean exception) {
//        return number1 * number2;
//    }

  //  @ExceptionHandler(IllegalArgumentException.class)
   // public Response response(IllegalArgumentException e) {
//        return new Response(e.getMessage());
  //  }
//}
