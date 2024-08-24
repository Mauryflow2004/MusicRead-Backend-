package com.example.songapp.controller;

import com.example.songapp.model.Recording;
import com.example.songapp.service.RecordingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/recordings")
public class RecordingController {
    @Autowired
    private RecordingService recordingService;

    @PostMapping
    public Recording uploadRecording(@RequestParam("file") MultipartFile file, @RequestParam("userId") Long userId, @RequestParam("themeId") Long themeId) throws IOException {
        String filePath = "uploads/" + file.getOriginalFilename(); // Define el directorio de subida
        file.transferTo(new File(filePath)); // Guarda el archivo

        Recording recording = new Recording();
        recording.setFilePath(filePath);
        // Aquí deberías asignar el usuario y la temática, que se obtendrían de la base de datos.
        // recording.setUser(...);
        // recording.setTheme(...);

        return recordingService.save(recording);
    }
}
