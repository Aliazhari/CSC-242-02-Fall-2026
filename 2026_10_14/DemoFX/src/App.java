import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class App extends Application  {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button button = new Button("Click here");
       Scene scene = new Scene(button);
      

       stage.setScene(scene);

       stage.show();
   
    }

   
}
