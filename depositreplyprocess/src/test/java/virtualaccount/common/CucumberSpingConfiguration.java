package virtualaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import virtualaccount.DepositreplyprocessApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DepositreplyprocessApplication.class })
public class CucumberSpingConfiguration {}
