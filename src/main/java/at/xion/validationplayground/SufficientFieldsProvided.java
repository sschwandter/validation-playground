package at.xion.validationplayground;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = { SufficientFieldsProvidedValidator.class })
@Documented
public @interface SufficientFieldsProvided {

  String message() default "At least either firstname or lastname must be provided";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };

}
