package com.als.webIde.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Table(name = "directory")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Directory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "directory_pk")
    private Long directoryPk;

    @ManyToOne
    @JoinColumn(name = "container_id", nullable = false)
    private Container container;

    @Column(name = "parent")
    private String parent;

}

