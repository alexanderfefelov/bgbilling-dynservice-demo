package com.github.alexanderfefelov.bgbilling.dynservice.demo;

import javax.jws.WebService;

@WebService
public interface Calculator {

    Float calculate(Float a, Float b, String op);

}
