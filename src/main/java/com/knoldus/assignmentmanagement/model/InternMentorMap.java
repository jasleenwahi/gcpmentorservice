package com.knoldus.assignmentmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.auditing.CurrentDateTimeProvider;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@IdClass(InternMentorMapId.class)
public class InternMentorMap {

    @Id
    private Integer intern;

    @Id
    private Integer mentor;

    private CurrentDateTimeProvider modified_date;

    private CurrentDateTimeProvider created_date;

}


