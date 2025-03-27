package com.example.spa;
thien
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomePage extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Trang Chủ - Trung Tâm Chăm Sóc Da");
        showHomePage();
    }

    private void showHomePage() {
        Button btnInfo = new Button("Thông Tin Trung Tâm");
        Button btnServices = new Button("Dịch Vụ");
        Button btnExperts = new Button("Chuyên Viên");
        Button btnBlog = new Button("Blog");

        btnInfo.setOnAction(e -> showInfoPage());
        btnServices.setOnAction(e -> showServicesPage());
        btnExperts.setOnAction(e -> showExpertsPage());
        btnBlog.setOnAction(e -> showBlogPage());

        VBox vbox = new VBox(10, btnInfo, btnServices, btnExperts, btnBlog);
        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showInfoPage() {
        VBox layout = new VBox(new Button("Quay lại"));
        layout.getChildren().get(0).setOnAction(e -> showHomePage());
        primaryStage.setScene(new Scene(layout, 400, 300));
    }

    private void showServicesPage() {
        VBox layout = new VBox(new Button("Quay lại"));
        layout.getChildren().get(0).setOnAction(e -> showHomePage());
        primaryStage.setScene(new Scene(layout, 400, 300));
    }

    private void showExpertsPage() {
        VBox layout = new VBox(new Button("Quay lại"));
        layout.getChildren().get(0).setOnAction(e -> showHomePage());
        primaryStage.setScene(new Scene(layout, 400, 300));
    }

    private void showBlogPage() {
        VBox layout = new VBox(new Button("Quay lại"));
        layout.getChildren().get(0).setOpacity(e -> showHomePage());
        primaryStage.setScene(new Scene(layout, 400, 300));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
