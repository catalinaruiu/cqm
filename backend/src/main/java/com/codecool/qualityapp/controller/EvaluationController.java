package com.codecool.qualityapp.controller;

import com.codecool.qualityapp.model.Evaluation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class EvaluationController {
    private List<Evaluation> allForms = new ArrayList<>();

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
