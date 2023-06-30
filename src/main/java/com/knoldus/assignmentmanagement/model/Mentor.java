package com.knoldus.assignmentmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.auditing.CurrentDateTimeProvider;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
    @SequenceGenerator(name="my_entity_seq_gen", sequenceName="MY_ENTITY_SEQ")
    private Integer mentorId;
    private String mentorName;
    private String emp_id;

    private String competency_name;

    private CurrentDateTimeProvider modified_date;

    private CurrentDateTimeProvider created_date;


}
