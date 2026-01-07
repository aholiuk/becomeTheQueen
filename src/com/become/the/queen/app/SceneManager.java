package com.become.the.queen.app;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class SceneManager {

  public void switchScene(ActionEvent event, String fxmlFile) {
    try {
      Stage stage = (Stage) ((Node) event.getSource())
              .getScene().getWindow();

      FXMLLoader loader = new FXMLLoader(
              SceneManager.class.getResource("/com/become/the/queen/" + fxmlFile)
      );

      Scene scene = new Scene(loader.load());
      stage.setScene(scene);
      stage.hide();
      stage.setMaximized(true);
      stage.show();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}



