package com.github.alexanderfefelov.bgbilling.dynservice.demo;

import ru.bitel.bgbilling.kernel.container.service.server.AbstractService;

public class CalculatorImpl extends AbstractService implements Calculator {

    @Override
    public Float calculate(Float a, Float b, String op) {
        switch (op) {
            case "add":
                return a + b;
            case "divide":
                return a / b;
            case "multiply":
                return a * b;
            case "subtract":
                return a - b;
            default:
                throw new IllegalArgumentException("Обратитесь к хрустальному шару");
        }
    }

}
