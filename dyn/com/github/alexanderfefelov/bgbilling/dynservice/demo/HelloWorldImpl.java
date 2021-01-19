package com.github.alexanderfefelov.bgbilling.dynservice.demo;

import ru.bitel.bgbilling.kernel.container.service.server.AbstractService;

public class HelloWorldImpl extends AbstractService implements HelloWorld {

    @Override
    public String helloWorld() {
        return "Hello, World!";
    }

}
