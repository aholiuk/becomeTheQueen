package com.become.the.queen;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.util.Duration;

import java.io.IOException;

public class InGameViewBishopController {

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
    switchScene(event, "LevelSelect.fxml");
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
