package rest.parallelogram.first_rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.parallelogram.first_rest.service.Parallelogram;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    private Parallelogram figure;


    public Controller(Parallelogram figure){
        this.figure = figure;
    }

    @GetMapping("descriprion-of-figure/{name}")
    public String description(@PathVariable String name){
        return figure.desciptionFigure(name);
    }

    @GetMapping("calculatePerimeter/{name}")
    public String Perimeter(@PathVariable String name){
        return figure.calculatePerimeter(name);
    }


    @GetMapping("calculateSquare/{name}")
    public String Square(@PathVariable String name){
        return figure.calculateSquare(name);
    }


}

