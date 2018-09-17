package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.dtos.FormattedGreetingDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class HelloAllWebController {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping(value = "/web/helloall", method = RequestMethod.GET)
    public String greeting(Model model) {
        List<FormattedGreetingDTO> greetings = getFormattedGreetings(hellos);
        model.addAttribute("greetings", greetings);
        return "helloall";
    }

    private List<FormattedGreetingDTO> getFormattedGreetings(String[] hellos) {
        List<FormattedGreetingDTO> formattedGreetings = new ArrayList<>();

        int redValue;
        int greenValue;
        int blueValue;
        int fontSizePercent;
        for (String hello : hellos) {
            redValue = getRandomInt(0, 255);
            greenValue = getRandomInt(0, 255);
            blueValue = getRandomInt(0, 255);
            fontSizePercent = getRandomInt(20, 250);

            formattedGreetings.add(new FormattedGreetingDTO(hello, redValue, greenValue, blueValue, fontSizePercent));
        }

        return formattedGreetings;
    }

    private int getRandomInt(int minInclusive, int maxInclusive) {
        return ThreadLocalRandom.current().nextInt(minInclusive, maxInclusive + 1);
    }
}
