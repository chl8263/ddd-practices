package com.example.dddpractices.common.util;

import com.example.dddpractices.common.domain.Email;
import com.example.dddpractices.common.domain.EmailSet;
import jakarta.persistence.AttributeConverter;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class EmailSetConverter implements AttributeConverter<EmailSet, String> {

    @Override
    public String convertToDatabaseColumn(EmailSet attribute) {
        if (attribute == null) return null;
        return attribute.getEmails().stream()
                .map(Email::getAddress)
                .collect(Collectors.joining(","));
    }

    @Override
    public EmailSet convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;
        String [] emails = dbData.split(",");
        Set<Email> emailSet = Arrays.stream(emails)
                .map(value -> Email.of(value))
                .collect(Collectors.toSet());
        return new EmailSet(emailSet);
    }
}
