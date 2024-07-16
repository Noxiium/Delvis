package dev.noxiium.delvis.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class CreateNewGroupRequestDTO {
    private final String groupName;
    private final Integer createdByID;
    private final Timestamp createdAt;
    private final String description;
    private final List<Long> groupUsersID;
}
