/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.security.Timestamp;
import java.util.Calendar;

import javax.swing.plaf.SliderUI;

import javafx.application.Application;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class ClasePrincipal extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane s=new StackPane();
		
		
              Label lb1=new Label("Elige color de letra:");
         ColorPicker colorPicker = new ColorPicker();
        colorPicker.setValue(Color.CORAL);
        
        Label lb12=new Label("Elige color de fondo:");
         ColorPicker colorPicker2 = new ColorPicker();
        
        final Text text = new Text("Try the color picker!");
        text.setFont(Font.font ("Verdana", 20));
        text.setFill(colorPicker.getValue());
        

        colorPicker.setOnAction((ActionEvent t) -> {
            text.setFill(colorPicker.getValue());
        });
        
        
        VBox v=new VBox(20);
        v.setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        
         colorPicker2.setOnAction((ActionEvent t) -> {
           v.setBackground(new Background(new BackgroundFill(colorPicker2.getValue(),null,null)));
        });
        

        v.getChildren().addAll(lb1,colorPicker,lb12,colorPicker2, text);
        
        Scene scene=new Scene(v, 500, 500);
        
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}