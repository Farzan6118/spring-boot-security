package com.example.security.domain.entity;

import com.example.security.domain.enums.RecordStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity<ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    @Column(nullable = false, unique = true, updatable = false, columnDefinition = "uuid")
    private UUID uuid;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @CreatedBy
    @Column(nullable = false, updatable = false)
    private UUID createdBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @LastModifiedBy
    private UUID lastModifiedBy;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RecordStatus recordStatus;

    @PrePersist
    public void prePersist() {
        if (recordStatus == null) {
            recordStatus = RecordStatus.ACTIVE;
        }
        if (this.uuid == null) {
            this.uuid = UUID.randomUUID();
        }
    }

}
