package com.cyprus.banking.ui;

import com.cyprus.banking.ui.UI_Application.StageReadyEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UI_Initializer implements ApplicationListener<StageReadyEvent> {

    @Value("classpath:ui.fxml")
    private Resource resource;
    private ApplicationContext context;

    public UI_Initializer(ApplicationContext context) {
        this.context = context;
    }


    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        try{
            Stage stage = event.getStage();
            FXMLLoader loader = new FXMLLoader(resource.getURL());
            Parent root = loader.load();
            stage.setScene(new Scene(root, 800, 600));
            stage.show();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
