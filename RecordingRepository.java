package com.example.songapp.repository;

import com.example.songapp.model.Recording;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordingRepository extends JpaRepository<Recording, Long> {}
