package tech.testy.cucumber.stepdefs;

import tech.testy.TestyApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TestyApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
