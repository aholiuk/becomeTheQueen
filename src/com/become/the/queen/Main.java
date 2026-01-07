package com.become.the.queen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("home/HomePage.fxml"));
    Scene scene = new Scene(loader.load(), 600, 400);
    stage.setTitle("Become The Queen");
    stage.setMaximized(true);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
