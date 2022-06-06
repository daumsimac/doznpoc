package virtualaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import virtualaccount.ExtAsyncRcvApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ExtAsyncRcvApplication.class })
public class CucumberSpingConfiguration {}
