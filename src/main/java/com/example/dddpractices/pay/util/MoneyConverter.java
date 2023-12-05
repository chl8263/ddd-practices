package com.example.dddpractices.pay.util;

import com.example.dddpractices.pay.domain.Money;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class MoneyConverter implements AttributeConverter<Money, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Money money) {
        return money == null ? null : money.getValue();
    }


//    @Override
//    public Money convertToEntityAttribute(Integer value) {
//        return value == null ? null : new Money(value);
//    }
    @Override
    public Money convertToEntityAttribute(Integer value) {
        return value == null ? null : Money.createValueOf(value);
    }
}
