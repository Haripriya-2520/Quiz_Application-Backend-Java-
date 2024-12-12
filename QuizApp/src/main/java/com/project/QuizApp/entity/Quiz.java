package com.project.QuizApp.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Getter
@Setter
public class Quiz {
          @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
          private String title;
          private int numQ;

    @ManyToMany(fetch = FetchType.EAGER)

    private List<Question> questions;

}
