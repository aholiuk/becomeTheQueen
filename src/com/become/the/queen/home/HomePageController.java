package com.become.the.queen.home;

import com.become.the.queen.app.SceneManager;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import java.io.IOException;

public class HomePageController {

  private static SceneManager scene = new SceneManager();

  @FXML
  private void startNewGame(ActionEvent event) throws IOException {
    scene.switchScene(event, "NewGame.fxml");
  }

  @FXML
  private void continueGame(ActionEvent event) throws IOException {
    scene.switchScene(event, "LevelSelect.fxml");
  }

  @FXML
  private void openSettings(ActionEvent event) throws IOException {
    scene.switchScene(event, "settings.fxml");
  }

  @FXML
  private void openCredits(ActionEvent event) throws IOException {
    scene.switchScene(event, "credits.fxml");
  }

  public void toggleLanguage(ActionEvent event) throws IOException {
    scene.switchScene(event, "HomePageDE.fxml");
  }

  @FXML
  private void quitGame() {
    System.exit(0);
  }

}
