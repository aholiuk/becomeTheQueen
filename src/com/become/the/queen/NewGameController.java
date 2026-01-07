package com.become.the.queen;

import com.become.the.queen.app.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;


public class NewGameController {

  private static SceneManager scene = new SceneManager();

  @FXML
  private void returnHome(ActionEvent event) throws IOException {
    scene.switchScene(event, "HomePage.fxml");
  }

  @FXML
  private void beginPawnLevel(ActionEvent event) throws IOException {
    scene.switchScene(event, "Game.fxml");
  }
}
