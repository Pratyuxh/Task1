package com.example.Task1.entity;

import lombok.*;
import jakarta.persistence.*;
@Entity
@Getter
@Setter
@Table(name = "ImageData")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    @Lob
    @Column(name = "imagedata", length = 1000)
    private byte[] imageData;

}
