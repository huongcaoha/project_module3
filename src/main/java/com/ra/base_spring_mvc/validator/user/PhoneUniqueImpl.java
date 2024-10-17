package com.ra.base_spring_mvc.validator.user;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneUniqueImpl implements ConstraintValidator<PhoneUnique,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
