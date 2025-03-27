package br.com.oliveira25lucas.controllers;

import br.com.oliveira25lucas.services.PersonServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestLogController {

    private Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());


    @GetMapping("/test")
    public String testLog() {

        logger.debug("This is a DEBUG log!");
        logger.info("This is a INFO log!");
        logger.warn("This is a INFO log!");
        logger.error("This is a ERROR log!");

        return "Logs generator successfully!";
    }
}
