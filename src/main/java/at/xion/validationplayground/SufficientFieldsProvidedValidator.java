package at.xion.validationplayground;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SufficientFieldsProvidedValidator implements ConstraintValidator<SufficientFieldsProvided, RequestModel> {

  @Override
  public boolean isValid(RequestModel request, ConstraintValidatorContext constraintValidatorContext) {
    return request.firstname!=null || request.lastname!=null;
  }

  @Override
  public void initialize(SufficientFieldsProvided constraintAnnotation) {
    ConstraintValidator.super.initialize(constraintAnnotation);
  }
}
