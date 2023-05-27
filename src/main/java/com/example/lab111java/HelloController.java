package com.example.lab111java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class HelloController {
    @FXML
    public TextField textField1;
    @FXML
    public TextField textField2;
    @FXML
    public TextField textField3;
    @FXML
    public TextField textField4;
    public Label label1;
    public Label label2;
    public Label label3;
    public Label label4;
    public Label label5;
    public Label label8;
    public Label label7;
    public Label label6;
    @FXML
    private String filePath = "data.txt";

    @FXML
    protected void writeIntoFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            int integer = Integer.parseInt(textField1.getText());
            double dou = Double.parseDouble(textField2.getText());
            String str = textField3.getText();
            writer.write(String.valueOf(integer));
            writer.newLine();
            writer.write(String.valueOf(dou));
            writer.newLine();
            writer.write(str);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void writetoTheEnd() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            String str = textField4.getText();
            writer.write(str);
            writer.newLine();
            textField4.setText("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void readSymbols() {
        try(FileReader fileReader =new FileReader(filePath)){
            StringBuilder stringBuilder = new StringBuilder();
            char[] symbols = new char[7];
            int c;
            while((c=fileReader.read(symbols))>0){
                if(c<7){
                    symbols = Arrays.copyOf(symbols,c);
                }
                stringBuilder.append(String.valueOf(symbols));
            }
            label5.setText(stringBuilder.toString());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void readSymbol() {
        try(FileReader fileReader =new FileReader(filePath)){
            StringBuilder stringBuilder = new StringBuilder();
            int c;
            while((c=fileReader.read())!=-1){

                stringBuilder.append((char) c);
            }
            label8.setText(stringBuilder.toString());
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void readBuffer() {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            label6.setText(bufferedReader.lines().collect(Collectors.joining(System.lineSeparator())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void readLines() {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while((line = bufferedReader.readLine())!=null){
               stringBuilder.append(line).append("\n");
            }
            label7.setText(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}