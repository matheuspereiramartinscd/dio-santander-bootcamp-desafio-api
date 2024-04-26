package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    private List<Game> games = new ArrayList<>();

    @GetMapping
    public List<Game> getAllGames() {
        return games;
    }

    @PostMapping
    public Game addGame(@RequestBody Game game) {
        games.add(game);
        return game;
    }
}