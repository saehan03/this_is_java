package com.mjc813.cafe_kiosk.models.sale;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleService {
    private final SaleRepository saleRepository;

    public SaleDto insert(SaleDto newDto) {
        SaleEntity newEntity = new SaleEntity();
        newEntity.copyMembers(newDto, true);
        newEntity.setId(null);
        SaleEntity save = this.saleRepository.save(newEntity);
        SaleDto result = new SaleDto();
        result.copyMembers(save, true);
        return result;                                      //기억하고 있을것
    }
}
