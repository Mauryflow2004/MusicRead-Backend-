package com.example.songapp.controller;

import com.example.songapp.model.Theme;
import com.example.songapp.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/themes")
public class ThemeController {
    @Autowired
    private ThemeService themeService;

    @GetMapping
    public List<Theme> getThemes() {
        return themeService.findAll();
    }

    @PostMapping
    public Theme createTheme(@RequestBody Theme theme) {
        return themeService.save(theme);
    }
}
