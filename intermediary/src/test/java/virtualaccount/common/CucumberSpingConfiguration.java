package virtualaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import virtualaccount.IntermediaryApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { IntermediaryApplication.class })
public class CucumberSpingConfiguration {}
