package com.gestion.jc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;



public class AdminApplication extends Application {

    private static final String INITIAL_PAGE= "pages/init.fxml";

    private static ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() throws Exception {
        applicationContext = SpringApplication.run(JcApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource(INITIAL_PAGE));
        loader.setControllerFactory(applicationContext::getBean);
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }

}
