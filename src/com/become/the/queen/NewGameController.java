package com.become.the.queen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class NewGameController {
  @FXML
  private void returnHome(ActionEvent event) throws IOException {
    switchScene(event, "HomePage.fxml");
  }

  @FXML
  private void beginPawnLevel(ActionEvent event) throws IOException {
    switchScene(event, "InGameViewPawn.fxml");
  }

  @FXML
  private void switchScene(ActionEvent event, String fxmlFile) throws IOException {
    Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
    Scene scene = new Scene(loader.load());

    stage.setScene(scene);
    stage.hide();
    stage.setMaximized(true);
    stage.show();
  }
}
