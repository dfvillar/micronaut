package com.ciber.enigma.service;

import com.ciber.enigma.beans.AdviceResponse;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
@Singleton
public class AdviceService {
    private List<String> phrases;

    {
        phrases = new ArrayList<>();
        phrases.add("When people ask me stupid questions, it is my legal obligation to give a sarcastic remark.");
        phrases.add("It’s okay if you don’t like me. Not everyone has good taste.");
        phrases.add("You look good when your eyes are closed, but you look the best when my eyes closed.");
        phrases.add("Mirrors can’t talk, lucky for you they can’t laugh either.");
        phrases.add("If had a dollar for every smart thing you say. I’ll be poor.");
        phrases.add("I don’t believe in plastic surgery. But in your case, go ahead.");
        phrases.add("Are you always so stupid or is today a special occasion?");
        phrases.add("I feel so miserable without you, it’s almost like having you here.");
        phrases.add("If you find me offensive. Then I suggest you quit finding me.");
        phrases.add("Everyone seems normal until you get to know them.");
        phrases.add("You are the luckiest animal!");
    }

    public AdviceResponse getRandomAdvice(final String name){

        final AdviceResponse adviceResponse = new AdviceResponse();
        adviceResponse.setName(name);
        adviceResponse.setAdvice(phrases.get(this.getRandom()));
        log.info("the advice generated {} ", adviceResponse.toString());
        return adviceResponse;
    }

    private Integer getRandom(){
        Random rand = new Random();
        return (int) rand.nextInt((10 - 0) + 1) + 0;
    }
}
