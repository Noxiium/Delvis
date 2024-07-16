package dev.noxiium.delvis.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "groups")
@Getter
@Setter
@NoArgsConstructor
public class GroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @NotNull
    @Column(name = "group_name", nullable = false, length = 100)
    private String groupName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    private UserEntity createdBy;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;
}