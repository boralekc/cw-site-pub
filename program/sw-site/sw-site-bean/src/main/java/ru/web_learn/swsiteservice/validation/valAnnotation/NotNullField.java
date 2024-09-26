package ru.web_learn.swsiteservice.validation.valAnnotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotNullValidator.class)

public @interface NotNullField {
    String message() default "Должно быть указано значение!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
