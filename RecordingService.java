package com.example.songapp.service;

import com.example.songapp.model.Recording;
import com.example.songapp.repository.RecordingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordingService {
    @Autowired
    private RecordingRepository recordingRepository;

    public Recording save(Recording recording) {
        return recordingRepository.save(recording);
    }
}
