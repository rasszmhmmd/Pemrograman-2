package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("Nama");
        kolom1.setCellValueFactory(new PropertyValueFactory<>("nim"));
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getItems().add(new Mahasiswa(1, "1112211", "Rasyid"));
        tabel.getItems().add(new Mahasiswa(2, "2223322", "Kida"));
        tabel.getItems().add(new Mahasiswa(3, "3334433", "Mimi"));
        tabel.getItems().add(new Mahasiswa(4, "4445544", "Cici"));
        tabel.getItems().add(new Mahasiswa(5, "5556655", "Ibun"));
        tabel.getItems().add(new Mahasiswa(6, "6667766", "Don"));
        tabel.getItems().add(new Mahasiswa(7, "7778877", "Abdul"));
        tabel.getItems().add(new Mahasiswa(8, "8889988", "Kido"));
        tabel.getItems().add(new Mahasiswa(9, "9990099", "Kidi"));
        tabel.getItems().add(new Mahasiswa(10, "1011110", "Kinza"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}