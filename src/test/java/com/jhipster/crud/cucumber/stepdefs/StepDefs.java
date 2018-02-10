package com.jhipster.crud.cucumber.stepdefs;

import com.jhipster.crud.JhcrudApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhcrudApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
