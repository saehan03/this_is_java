package com.mjc813.swim.swimpool;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SwimPoolDto {
    private Long id;
    private String Name;
    private Long tel;
    private String addr1;
    private Long addr2;
    private Long lanes;
    private Long size;
}
