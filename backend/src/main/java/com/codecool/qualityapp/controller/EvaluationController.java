package com.codecool.qualityapp.controller;

import com.codecool.qualityapp.model.Evaluation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class EvaluationController {
    private List<Evaluation> allForms = new ArrayList<>();

    public EvaluationController() {
        // Initialize the list with some Evaluation objects
        allForms.add(new Evaluation(1, 88.5, "Nicely done!", "Ada", 157));
        allForms.add(new Evaluation(2, 67.2, "Needs improvement.", "John", 634));
        allForms.add(new Evaluation(3, 99.0, "Excellent work!", "Jane", 873));
    }

    @GetMapping
    public List<Evaluation> getQualityForms() {
        return allForms;
    }

    @PostMapping
    public Evaluation create(@RequestBody Evaluation evaluation) {
        allForms.add(evaluation);
        return evaluation;
    }

    @DeleteMapping("/{id}")
    public void deleteQualityForm(@PathVariable int id) {
        allForms.removeIf(f -> f.getId() == id);
    }
}
