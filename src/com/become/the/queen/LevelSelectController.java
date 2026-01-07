package com.become.the.queen;

import com.become.the.queen.app.SceneManager;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import java.io.IOException;


public class LevelSelectController {

  private static SceneManager scene = new SceneManager();

  @FXML
  private void returnHome(ActionEvent event) throws IOException {
    scene.switchScene(event, "HomePage.fxml");
  }

  @FXML
  private void beginPawnLevel(ActionEvent event) throws IOException {
    scene.switchScene(event, "Game.fxml");
  }

  @FXML
  private void beginBishopLevel(ActionEvent event) throws IOException {
    scene.switchScene(event, "InGameViewBishop.fxml");
  }

  @FXML
  private void beginKnightLevel(ActionEvent event) throws IOException {
    scene.switchScene(event, "InGameViewKnight.fxml");
  }

  @FXML
  private void beginRookLevel(ActionEvent event) throws IOException {
    scene.switchScene(event, "InGameViewRook.fxml");
  }
}
