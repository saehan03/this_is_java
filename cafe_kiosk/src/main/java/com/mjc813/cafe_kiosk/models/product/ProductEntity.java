package com.mjc813.cafe_kiosk.models.product;

import com.mjc813.cafe_kiosk.models.category.CategoryEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false) //length 최대 50자
    private String name;

    @Column(nullable = false)
    private Integer price;

    @JoinColumn(name="category_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER) // ManyToOne 많은 행이 있고 마스터에는 한 행이 있다는 뜻.
    private CategoryEntity category; // CategoryEntity를 넣어야한다 절대 Integer로 하면 안된다. + categoryId -> category

    @Column(length = 500, nullable = true)
    private String picture;
}
