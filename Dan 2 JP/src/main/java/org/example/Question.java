package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Question {

    private Integer questionId;
    private String text;
    private String intent;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private Integer categoryId;
    private Category category;




}
