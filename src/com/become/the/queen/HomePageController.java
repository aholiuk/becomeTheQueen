package com.become.the.queen;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import java.io.IOException;

public class HomePageController {

  @FXML
  private void startNewGame(ActionEvent event) throws IOException {
    switchScene(event, "NewGame.fxml");
  }

  @FXML
  private void continueGame(ActionEvent event) throws IOException {
    switchScene(event, "LevelSelect.fxml");
  }

  @FXML
  private void openSettings(ActionEvent event) throws IOException {
    switchScene(event, "settings.fxml");
  }

  @FXML
  private void openCredits(ActionEvent event) throws IOException {
    switchScene(event, "credits.fxml");
  }

  public void toggleLanguage(ActionEvent event) throws IOException {
    switchScene(event, "HomePageDE.fxml");
  }

  @FXML
  private void quitGame() {
    System.exit(0);
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
