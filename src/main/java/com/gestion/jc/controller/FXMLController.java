package com.gestion.jc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


import java.io.IOException;

public class FXMLController {

    @Autowired
    private ApplicationContext context;

    public void closeLastPage(ActionEvent actionEvent) {
        final Node source = (Node) actionEvent.getSource();
        final Stage initStage = (Stage) source.getScene().getWindow();
        initStage.close();
    }


    public void openFxmlPage(String route) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getClassLoader().getResource(route));
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

    protected Stage getDialogCreatedOk(String okMessage) {
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren().add(new Text(okMessage));
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        return dialog;
    }

    protected Stage getDialogCreatedError(String errorMsg) {
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren().add(new Text("errorMsg"));
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        return dialog;
    }

}
