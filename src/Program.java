import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Program extends Application {
        int count = 0;
    @Override
    public void start (Stage primaryStage){
        primaryStage.setTitle("MyWindow");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);


        Pane root = new Pane();
        Label label =new Label("Lada");
        label.setFont(new Font(20));
        Button btn =new Button ("Click here.");
        btn.setLayoutX(20);
        btn.setLayoutY(70);
        btn.setPrefSize(120,50);


        TextField textField = new TextField();
        textField.setLayoutX(100);
        textField.setLayoutY(0);
        textField.setFont(new Font(17));
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String  txText = textField.getText();
                label.setText(txText);
                String text = "Not found is name";
                if (!txText.isEmpty()) {
                    label.setText("Name:"+ txText);
                } else{
                    label.setText("Name:"+ text);
                }

            }
        });

        Scene scene =new Scene(root);
        root.getChildren().add(textField);
        root.getChildren().add(label);
        root.getChildren().add(btn);


        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.show();
    }
    public static void main(String [] args){
        Application.launch(args);


    }
}
