package com.cyprus.banking;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UI_Application extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init(){
        applicationContext = new SpringApplicationBuilder(UI_Application.class).run();
    }

    @Override
    public void stop(){
        applicationContext.close();
        Platform.exit();
    }

    @Override
    public void start(Stage stage){
        applicationContext.publishEvent(new StageReadyEvent(stage));
    }

    public static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage(){
            return ((Stage) getSource());
        }
    }
}
