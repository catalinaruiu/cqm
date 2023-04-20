package com.codecool.qualityapp.controller;

import com.codecool.qualityapp.model.QualityForm;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class QualityFormController {
    private List<QualityForm> allForms = new ArrayList<>();

    public QualityFormController() {
        // Initialize the list with some QualityForm objects
        allForms.add(new QualityForm(1, 88.5, "Nicely done!"));
        allForms.add(new QualityForm(2, 67.2, "Needs improvement."));
        allForms.add(new QualityForm(3, 99.0, "Excellent work!"));
    }

    @GetMapping
    public List<QualityForm> getQualityForms() {
        return allForms;
    }

    @PostMapping
    public QualityForm create(@RequestBody QualityForm qualityForm) {
        allForms.add(qualityForm);
        return qualityForm;
    }

    @DeleteMapping("/{id}")
    public void deleteQualityForm(@PathVariable int id) {
        allForms.removeIf(f -> f.getId() == id);
    }
}
