package com.gestion.jc.controller;

import com.gestion.jc.util.PageRoute;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


@Component
public class InitController extends FXMLController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    public void clientBtnSelected(ActionEvent actionEvent) throws IOException {
        closeLastPage(actionEvent);
        openFxmlPage(PageRoute.ABM_CLIENT.getRoute());
    }

}
