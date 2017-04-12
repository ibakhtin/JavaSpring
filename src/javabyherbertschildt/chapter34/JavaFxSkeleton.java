package javabyherbertschildt.chapter34;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * @author ibakhtin
 */
public class JavaFxSkeleton extends Application{
    public static void main(String[] args) {
        System.out.println("Launching JavaFX application.");
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("Inside the init() method.");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Inside the start() method.");

        FlowPane rootNode = new FlowPane();

        Scene scene = new Scene(rootNode, 800, 600);

        primaryStage.setTitle("JavaFX Skeleton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Inside the stop() method.");
    }
}
