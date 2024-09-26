package ru.web_learn.swsiteservice.validation.valAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class MaxSizeValidator implements ConstraintValidator<MaxSizeField, String> {
    private int maxSize;

    @Override
    public void initialize(MaxSizeField sizeField) {
        maxSize = sizeField.maxSize();
    }

    @Override
    public boolean isValid(String target, ConstraintValidatorContext ctx) {
        if (target != null) {
            if (target.length() > maxSize) {
                ctx.disableDefaultConstraintViolation();
                ctx.buildConstraintViolationWithTemplate("Не пройден форматный контроль. Превышен максимальный размер. Поле ")
                        .addConstraintViolation();
                return false;
            }
        }
        return true;
    }
}

