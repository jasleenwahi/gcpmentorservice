package com.knoldus.assignmentmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Intern {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
    @SequenceGenerator(name="my_entity_seq_gen", sequenceName="MY_ENTITY_SEQ")
    private Integer internId;
    private String emp_id;
    private String first_name;
    private String last_name;
    private String competency_name;
    private String skill;
    private LocalDate created_date = LocalDate.now();
    private LocalDate modified_date = LocalDate.now();

}
