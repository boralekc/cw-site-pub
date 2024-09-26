package ru.web_learn.swsiteservice.validation.valAnnotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SizeValidator.class)
public @interface SizeField {
    String message() default "Размер поля не соответствует требованиям!";

    int minSize() default 1;

    int maxSize() default 255;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
