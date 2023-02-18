package com.gestion.jc.controller;

import com.gestion.jc.adapter.ClientAdapter;
import com.gestion.jc.dto.ClientDto;
import com.gestion.jc.util.PageRoute;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


@Component
public class ABMClientsController extends FXMLController implements Initializable {

    @Autowired
    private ClientAdapter clientAdapter;

    @FXML
    private TableView<ClientDto> ClientTableId;

    @FXML
    private TableColumn<ClientDto, String> nameColumnId;

    @FXML
    private TableColumn<ClientDto, String> contactColumnId;

    @FXML
    private TableColumn<ClientDto, String> workInProgressColumnId;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameColumnId.setCellValueFactory(new PropertyValueFactory<ClientDto, String>( "name"));
        contactColumnId.setCellValueFactory(new PropertyValueFactory<ClientDto, String>( "contact"));
        workInProgressColumnId.setCellValueFactory(new PropertyValueFactory<ClientDto, String>( "hasWorkInProgress"));
        var clients = clientAdapter.find(Pageable.ofSize(20).withPage(0));
        ClientTableId.getItems().setAll(clients);
    }

    @FXML
    public void createNewClient(ActionEvent actionEvent) throws IOException {
        closeLastPage(actionEvent);
        openFxmlPage(PageRoute.CREATE_NEW_CLIENT.getRoute());
    }

}
