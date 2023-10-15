package com.example.salaryandrest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class HelloController {

    @FXML
    private Button addPriceMeals;

    @FXML
    private Button addSalary;

    @FXML
    private Button buyMeals;

    @FXML
    private ChoiceBox<?> choiceFX;

    @FXML
    private Button getSalary;

    @FXML
    private GridPane gridFX;
    @FXML
    private Button reducePriceMeals;

    @FXML
    private Button reduceSalary;

    @FXML
    private TextField showChangeSalary;

    @FXML
    private TextField showSumPrice;

    @FXML
    private TextField showWastes;

    @FXML
    private Button walkToBar;
    @FXML
    Label lab = new Label();

    public void loadPeople (GridPane g) throws IOException {
        List<String> list = Files.readAllLines(new File( "C:\\Users\\TERA\\IdeaProjects\\SalaryAndRest\\src\\main\\java\\com\\example\\salaryandrest\\People.txt").toPath());
        for (String s : list) {
            String[] words = s.split(",");
            int sal= Integer.parseInt(words[1]);
            int saiv= Integer.parseInt(words[2]);
            Employers emp = new Employers((words[0]), sal, saiv);
//            System.out.println(emp);
            Label lab = new Label(String.valueOf(words[0]));
            Label lab1 = new Label(String.valueOf(sal));
            Label lab2 = new Label(String.valueOf(saiv));
            g.add(lab,0 ,0 );
            g.add(lab1,0,1);
            g.add(lab2,0,2);
//            gridFX.setConstraints(lab,0,0);
        }
    }
//    @FXML
//    public void showPeople() throws IOException {
//        loadPeople(gridFX);
//    }

}