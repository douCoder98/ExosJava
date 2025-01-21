package org.example.tp7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class MainApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ma Première Application JavaFX");

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Ma Application JavaFX");

        Button bouton = new Button("Cliquez-moi !");
        Label etiquette = new Label("Bienvenue dans JavaFX !");

        // Ajout d'un gestionnaire d'événements pour le bouton
        bouton.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText(null);
            alert.setContentText("Le bouton a été cliqué !");
            alert.showAndWait();
        });

        vbox.getChildren().add(etiquette);
        vbox.getChildren().add(bouton);

        // Personnalisation du VBox
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20, 20, 20, 20));

        // Adaptation à la taille de la scène
        etiquette.setMaxWidth(Double.MAX_VALUE);
        bouton.setMaxWidth(Double.MAX_VALUE);
        VBox.setVgrow(etiquette, Priority.ALWAYS);
        VBox.setVgrow(bouton, Priority.ALWAYS);

        vbox.setSpacing(10); // Ajoute un espace de 10 pixels entre les composants
        vbox.setPadding(new Insets(20, 20, 20, 20)); // Ajoute des marges autour du conteneur

        scene.getStylesheets().add("styles.css");

        primaryStage.show();
    }
}
