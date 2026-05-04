package com.likelion.session.week5;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request){
        return request.getNumber1() * request.getNumber2();
    }

    @PostMapping("/subtract")
    public int subtractTwoNumbers(@RequestBody CalculatorSubtractRequest request){
        return request.getNumber1() - request.getNumber2();
    }

    @PostMapping("/divide")
    public int divideTwoNumbers(@RequestBody CalculatorDivideRequest request) {
        return request.getNumber1() / request.getNumber2();
    }

    @GetMapping("/add")
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }
}
