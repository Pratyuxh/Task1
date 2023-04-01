package com.example.Task1.repository;

import com.example.Task1.entity.FileData;
import com.example.Task1.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface StorageRepository extends JpaRepository<ImageData, Long> {
    Optional<ImageData> findByName(String fileName);
}
