package com.gestion.jc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FXMLController {

    @Autowired
    private ApplicationContext context;

    public void closeLastPage(ActionEvent actionEvent) {
        final Node source = (Node) actionEvent.getSource();
        final Stage initStage = (Stage) source.getScene().getWindow();
        initStage.close();
    }


    public void openFxmlPage(String route) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource(route));
        fxmlLoader.setControllerFactory(context::getBean);
        Parent parent = fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public void openFxmlPageWithPopUp(String route, Stage dialog) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource(route));
        fxmlLoader.setControllerFactory(context::getBean);
        Parent parent = fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
        dialog.show();
    }
}
