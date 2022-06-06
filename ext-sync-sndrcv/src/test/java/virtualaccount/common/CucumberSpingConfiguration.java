package virtualaccount.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import virtualaccount.ExtSyncSndrcvApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ExtSyncSndrcvApplication.class })
public class CucumberSpingConfiguration {}
