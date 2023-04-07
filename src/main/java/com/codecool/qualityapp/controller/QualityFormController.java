package com.codecool.qualityapp.controller;

import com.codecool.qualityapp.model.QualityForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class QualityFormController {
    private List<QualityForm> allForms = new ArrayList<>();

    public QualityFormController() {
        // Initialize the list with some QualityForm objects
        allForms.add(new QualityForm(1, 88.5, "Nicely done!"));
        allForms.add(new QualityForm(2, 67.2, "Needs improvement."));
        allForms.add(new QualityForm(3, 99.0, "Excellent work!"));
    }

    @GetMapping("/forms")
    public List<QualityForm> getQualityForms() {
        return allForms;
    }

//    @PostMapping("/forms")
//    public void create(@RequestBody QualityForm qualityForm) {
//        allForms.add(qualityForm);
//    }

    @PostMapping("/new-form")
    public ResponseEntity<String> addQualityForm() {
        allForms.add(new QualityForm(allForms.size() + 1, 95.0, "Great job!"));
        return ResponseEntity.ok("Quality form added successfully!");
    }

    @DeleteMapping("/forms/{id}")
    public void deleteQualityForm(@PathVariable int id) {
        Map<Integer, QualityForm> formsMap = allForms.stream()
                .collect(Collectors.toMap(QualityForm::getId, Function.identity()));
        formsMap.remove(id);
        allForms.clear();
        allForms.addAll(formsMap.values());
    }
}
