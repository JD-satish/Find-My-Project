package com.example.findmyproject.controller;

import com.example.findmyproject.model.Project;
import com.example.findmyproject.model.Researcher;
import com.example.findmyproject.service.ResearcherJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResearcherController {
    @Autowired
    private ResearcherJpaService researchJpaService;

    @GetMapping("/researchers")
    public ArrayList<Researcher> getResearchers() {
        return researchJpaService.getResearchers();
    }

    @GetMapping("/researchers/{researchId}")
    public Researcher getResearcherById(@PathVariable("researchId") int researchId) {
        return researchJpaService.getResearcherById(researchId);
    }

    @PostMapping("/researchers")
    public Researcher addResearcher(@RequestBody Researcher research) {
        return researchJpaService.addResearcher(research);
    }

    @PutMapping("/researchers/{researchId}")
    public Researcher updateResearcher(@PathVariable("researchId") int researchId, @RequestBody Researcher research) {
        return researchJpaService.updateResearcher(researchId, research);
    }

    @DeleteMapping("/researchers/{researchId}")
    public void deleteResearcher(@PathVariable("researchId") int researchId) {
        researchJpaService.deleteResearcher(researchId);
    }

    @GetMapping("/researchers/{researchId}/projects")
    public List<Project> getResearcherProjects(@PathVariable("researchId") int researchId) {
        return researchJpaService.getResearcherProjects(researchId);
    }
}
