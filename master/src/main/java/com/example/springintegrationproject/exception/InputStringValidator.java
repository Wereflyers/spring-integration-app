package com.example.springintegrationproject.exception;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class InputStringValidator implements ConstraintValidator<ValidParam, Object> {

    private String message;

    @Override
    public void initialize(ValidParam validParam) {
        message = validParam.message();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        boolean valid = true;
        String input = o.toString();
        if (input == null || input.replaceAll("\"", "").isBlank()) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(message).addConstraintViolation();
            valid = false;
        }
        return valid;
    }
}
