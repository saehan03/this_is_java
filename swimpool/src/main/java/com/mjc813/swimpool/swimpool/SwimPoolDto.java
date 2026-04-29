package com.mjc813.swimpool.swimpool;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SwimPoolDto implements ISwimPool {
    private Long id;
    private String Name;
    private String tel;
    private String addr1;
    private String addr2;
    private String lanes;
    private String size;
}
