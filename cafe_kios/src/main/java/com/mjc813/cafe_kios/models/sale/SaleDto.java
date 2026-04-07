package com.mjc813.cafe_kios.models.sale;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SaleDto {
    private Integer id;
    private Integer productId;
    private Integer qty;
    private Integer price;
    private LocalDateTime saleTime;
}
