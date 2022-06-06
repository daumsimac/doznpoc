package virtualaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import virtualaccount.ExtAsyncSndApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ExtAsyncSndApplication.class })
public class CucumberSpingConfiguration {}
