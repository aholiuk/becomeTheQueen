package com.become.the.queen.game;

import com.become.the.queen.app.SceneManager;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.*;
import javafx.util.Duration;

import java.io.IOException;

public class GameController {

  private static SceneManager scene = new SceneManager();

  @FXML private VBox sideMenu;
  private boolean menuOpen = false;

  @FXML
  private void toggleMenu() throws IOException {
    if (!menuOpen) {
      sideMenu.setVisible(true);
      sideMenu.setManaged(true);
      sideMenu.setTranslateX(-220);

      TranslateTransition tt = new TranslateTransition(Duration.millis(250), sideMenu);
      tt.setToX(0);
      tt.play();
    } else {
      TranslateTransition tt = new TranslateTransition(Duration.millis(250), sideMenu);
      tt.setToX(-220);
      tt.setOnFinished(e -> {
        sideMenu.setVisible(false);
        sideMenu.setManaged(false);
      });
      tt.play();
    }
    menuOpen = !menuOpen;
  }

  @FXML
  private void quitGame() {
    System.exit(0);
  }

  @FXML
  public void goToLevelSelect(ActionEvent event) throws IOException {
    scene.switchScene(event, "LevelSelect.fxml");
  }
}
