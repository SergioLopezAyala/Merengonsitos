package com.web.proyecto.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "activity_history")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class ActivityHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long activityId;
    private String fieldName;

    @Column(length = 1000)
    private String oldValue;

    @Column(length = 1000)
    private String newValue;
}
