package practice.springframework.jokesapp.jokesapp.controllers;

import practice.springframework.jokesapp.jokesapp.services.JokeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @GetMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
