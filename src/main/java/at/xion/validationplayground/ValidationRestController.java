package at.xion.validationplayground;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationRestController {

  @PutMapping("/validate")
  public void validate(@Valid @RequestBody RequestModel request) {
    System.out.println(request);
  }

}
