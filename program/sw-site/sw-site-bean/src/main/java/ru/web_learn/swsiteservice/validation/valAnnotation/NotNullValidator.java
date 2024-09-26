package ru.web_learn.swsiteservice.validation.valAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotNullValidator implements ConstraintValidator<NotNullField, Object> {
    public void initialize(NotNullField notNullField) {
    }

    @Override
    public boolean isValid(Object target, ConstraintValidatorContext ctx) {
        if (target != null) {
            return true;
        } else {
            ctx.disableDefaultConstraintViolation();
            ctx.buildConstraintViolationWithTemplate("Не пройден форматный контроль. Обязательное поле. Поле ")
                    .addConstraintViolation();
            return false;
        }
    }
}
