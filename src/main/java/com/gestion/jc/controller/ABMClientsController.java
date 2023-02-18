package com.gestion.jc.controller;

import com.gestion.jc.util.PageRoute;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;


import java.io.IOException;


@Component
public class ABMClientsController extends FXMLController {

    @FXML
    public void createNewClient(ActionEvent actionEvent) throws IOException {
        closeLastPage(actionEvent);
        openFxmlPage(PageRoute.CREATE_NEW_CLIENT.getRoute());
    }
}
