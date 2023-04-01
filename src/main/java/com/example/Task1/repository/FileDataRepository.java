package com.example.Task1.repository;

import com.example.Task1.entity.ImageData;
import com.example.Task1.entity.FileData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData, Integer> {
    Optional<FileData> findByName(String fileName);

}
