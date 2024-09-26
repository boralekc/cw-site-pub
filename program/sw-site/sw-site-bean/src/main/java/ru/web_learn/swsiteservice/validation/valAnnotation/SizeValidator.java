package ru.web_learn.swsiteservice.validation.valAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SizeValidator implements ConstraintValidator<SizeField, String> {
    private int minSize;
    private int maxSize;

    @Override
    public void initialize(SizeField sizeField) {
        minSize = sizeField.minSize();
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
            if (target.length() < minSize) {
                ctx.disableDefaultConstraintViolation();
                ctx.buildConstraintViolationWithTemplate("Не пройден форматный контроль. Размер меньше допустимого. Поле ")
                        .addConstraintViolation();
                return false;
            }
        }
        return true;
    }
}
