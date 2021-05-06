package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MySceneController {

    @FXML
    private Button myButton;

    @FXML
    private TextField myTextField;
    
    public void showDateTime() {
    	Date now= new Date();
    	DateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    	
    	String dateTimeString=dFormat.format(now);
    	
    	myTextField.setText(dateTimeString);
    	
    }
}
