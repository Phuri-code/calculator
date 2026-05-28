
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button botton_calculate;

    @FXML
    private Label label_result;

    @FXML
    private TextField textfield_num1;

    @FXML
    private TextField textfield_num2;

    @FXML
    void on_calculate(ActionEvent event) {
        // System.out.println("Button clicked!");
        String str_num1 = textfield_num1.getText();
        String str_num2 = textfield_num2.getText();

        System.out.println(str_num1);
        System.out.println(str_num2);

        double db_num1 = Double.parseDouble(str_num1);
        double db_num2 = Double.parseDouble(str_num2);
        double sum = db_num1 + db_num2;
        // System.out.println("sum : " + sum);
        String str_sum = Double.toString(sum);
        label_result.setText(str_sum);


    }

}
