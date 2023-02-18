package com.gestion.jc.controller;

import com.gestion.jc.adapter.ClientAdapter;
import com.gestion.jc.dto.ClientDto;
import com.gestion.jc.util.PageRoute;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class CreateClientController extends FXMLController {

    @FXML
    private TextField nameTxt;
    @FXML
    private TextField contactTxt;
    @FXML
    private TextArea extraDataTxt;
    @Autowired
    private ClientAdapter clientAdapter;

    @FXML
    public void save(ActionEvent actionEvent) throws IOException {

        if (nameTxt.getText() == null || contactTxt.getText() == null
                || nameTxt.getText().isEmpty() || contactTxt.getText().isEmpty()) {

        }

        ClientDto clientDto = this.createNewDtoClient();

        //clientAdapter.save(clientDto);

        var createdOkDialog = getDialogCreatedOk();

        openFxmlPageWithPopUp(PageRoute.ABM_CLIENT.getRoute(), createdOkDialog);

        closeLastPage(actionEvent);
    }


    private ClientDto createNewDtoClient() {
        ClientDto clientDto = ClientDto.builder()
                .contact(contactTxt.getText())
                .name(nameTxt.getText())
                .extraData(extraDataTxt.getText())
                .build();
        return clientDto;
    }

    private Stage getDialogCreatedOk() {
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren().add(new Text("This is a Dialog"));
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        return dialog;
    }
}
