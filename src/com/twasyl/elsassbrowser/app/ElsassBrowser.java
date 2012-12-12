package com.twasyl.elsassbrowser.app;

import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created with IntelliJ IDEA.
 * User: twasyl
 * Date: 12/11/12
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElsassBrowser extends Application {

    private static ObjectProperty<Stage> currentStage;

    public static ObjectProperty<Stage> currentStageProperty() {
        return currentStage;
    }

    public static Stage getCurrentStage() {
        return currentStageProperty().get();
    }

    @Override
    public void start(Stage stage) throws Exception {
        currentStage = new SimpleObjectProperty<Stage>(stage);

        Parent root =
                FXMLLoader.load(getClass().getResource("/com/twasyl/elsassbrowser/resources/fxml/ElsassBrowser.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ElsassBrowser.class, args);
    }
}
