package com;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;

    // chỉ cần method có tên initialize() thì được coi là phương thức khởi tạo có thể thêm đánh đấu @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicker(ActionEvent event) {

        // method event.getSource() lấy ra method toString của đối tượng control trong FXML đã tạo ra xự kiện
        if (event.getSource().equals(helloButton)) {
            System.out.println("Hello " + nameField.getText());
        }else if (event.getSource().equals(byeButton)) {
            System.out.println("Bye " + nameField.getText());
        }
    }

    @FXML
    public void handleKeyReleased(){

        //method isBlank() trả về true nếu String rỗng hoặc chỉ chứa khoảng trắng(dấu cách)
        boolean disableButton = nameField.getText().isBlank();
        helloButton.setDisable(disableButton);
        byeButton.setDisable(disableButton);
    }
}