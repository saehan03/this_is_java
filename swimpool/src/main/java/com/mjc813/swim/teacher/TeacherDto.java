package com.mjc813.swim.teacher;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherDto {
    private Long id;
    private String Name;
    private String main;
    private Long birthYear;
    private Long swimPoolid;
}
