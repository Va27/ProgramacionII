package sample;

/**
 * Created by Vivi-PC on 03/03/2016.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        System.out.print(" TAREA # 2");
        System.out.print("\n PROGRAMACIÓN II");
        System.out.print("\n \nPREPARADO POR: VIVIAN ALVAREZ");
        System.out.print("\n \n TRIBUNAL ELECTORAL UIP");
        System.out.println("\n\n Usted en conocer si puede realizar su votación:");

        primaryStage.setTitle("Verificación Electoral");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
