package com.vbs.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class History {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    @Column(nullable = false)
    String description;
    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    LocalDateTime date;
}
