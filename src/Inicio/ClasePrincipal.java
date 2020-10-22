/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import java.security.Timestamp;
import java.util.Calendar;

import javax.swing.plaf.SliderUI;

import javafx.application.Application;
import static javafx.application.Application.launch;
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
		
            ColorPicker colorPicker=new ColorPicker();
            
            
        VBox v=new VBox(20);
        
        v.getChildren().addAll(colorPicker);
        Scene scene=new Scene(v, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}