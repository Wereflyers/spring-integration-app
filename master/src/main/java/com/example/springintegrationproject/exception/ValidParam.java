package com.example.springintegrationproject.exception;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {InputStringValidator.class})
public @interface ValidParam {
    Class<?>[] groups() default {};
    String message() default "Input should not be empty";
    Class<? extends Payload>[] payload() default {};
}
