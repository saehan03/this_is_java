package com.mjc813.cafe_kiosk.models.category;

import lombok.Getter;
public interface ICategory {
    Integer getId();

    String  getName();

    void setId(Integer id);

    void setName(String name);
}
    default void copyMemberValue(CategoryDto categoryDto) {
        if( src == null) {
            return;
        }
        if ( src.getId() != null) {
            this.setId(src.getId());
        }
        if ( src.getName() != null) {
            this.setName(src.getName());
    }

}
