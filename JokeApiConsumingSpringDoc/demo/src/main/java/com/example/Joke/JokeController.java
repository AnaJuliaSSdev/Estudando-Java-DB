package com.example.Joke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/jokeRandom")
public class JokeController {
     private final RestTemplate restTemplate;

     @Autowired
    public JokeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping
    public Quote getRandomJoke() {
        return restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/random", Quote.class);
    }


}
