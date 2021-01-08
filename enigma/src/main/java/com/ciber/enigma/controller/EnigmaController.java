package com.ciber.enigma.controller;

import com.ciber.enigma.beans.AdviceResponse;
import com.ciber.enigma.service.AdviceService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.RequestAttribute;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Controller("enigma")
@Slf4j
public class EnigmaController {
    @Inject
    private AdviceService adviceService;

    @Get(value = "advice/{name}", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<?> getRandomLifeTip( @RequestAttribute String name){
        log.info("advice controller");
        AdviceResponse adviceResponse = adviceService.getRandomAdvice(name);
        return HttpResponse.status(HttpStatus.OK).body(adviceResponse);
    }
}
