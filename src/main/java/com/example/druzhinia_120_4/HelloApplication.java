package com.example.druzhinia_120_4;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Menu menu = new Menu();
        menu.forStart().show();
    }
    public static void main(String[] args) {
       launch();
  }
}