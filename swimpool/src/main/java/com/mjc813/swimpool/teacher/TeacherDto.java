package com.mjc813.swimpool.teacher;

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
