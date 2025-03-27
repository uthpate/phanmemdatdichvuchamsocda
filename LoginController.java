package com.example.spa;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    public void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.equals("admin@example.com") && password.equals("admin")) {
            showAlert("Đăng nhập thành công!");
        } else {
            showAlert("Sai thông tin đăng nhập!");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setContentText(message);
        alert.show();
    }
}
