package com.gestion.jc.infraestructure.init;

import com.gestion.jc.infraestructure.FXMLController;
import com.gestion.jc.util.PageRoute;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class InitController extends FXMLController {

    @FXML
    public void clientBtnSelected(ActionEvent actionEvent) throws IOException {
        closeLastPage(actionEvent);
        openFxmlPage(PageRoute.ABM_CLIENT.getRoute());
    }

    @FXML
    public void orderBtnSelected(ActionEvent actionEvent) throws IOException {
        closeLastPage(actionEvent);
        openFxmlPage(PageRoute.ABM_ORDER.getRoute());
    }

}
