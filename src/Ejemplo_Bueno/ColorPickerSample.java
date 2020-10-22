/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Bueno;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;
 
public class ColorPickerSample extends Application {
      
    
    
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) {
        stage.setTitle("Camiseta de colores");
 
        
        
 
        ToolBar tb = new ToolBar();
        
 
        Label lbl1=new Label("Color camiseta");
        Label lbl2=new Label("Color fondo");
       
        final ColorPicker colorPicker = new ColorPicker();
        final ColorPicker colorPicker2 = new ColorPicker();
        tb.getItems().addAll(colorPicker);
 
        StackPane stack = new StackPane();
       
 
        final SVGPath svg = new SVGPath();
        svg.setContent("M70,50 L90,50 L120,90 L150,50 L170,50"
            + "L210,90 L180,120 L170,110 L170,200 L70,200 L70,110 L60,120 L30,90"
            + "L70,50");
        svg.setStroke(Color.DARKGREY);
        svg.setStrokeWidth(2);
        svg.setEffect(new DropShadow());
        svg.setFill(colorPicker.getValue());
        stack.getChildren().addAll(svg);
        
 
        colorPicker.setOnAction((ActionEvent t) -> {
            svg.setFill(colorPicker.getValue());
        });
 
        
       
        colorPicker.setStyle("-fx-background-color:cyan;  -fx-background-radius:15;");
        colorPicker2.setStyle("-fx-background-color:purple;  -fx-background-radius:15;");

            VBox v=new VBox(20);
        colorPicker2.setOnAction((ActionEvent t) -> {
           v.setBackground(new Background(new BackgroundFill(colorPicker2.getValue(),null,null)));
        });
        
        
        colorPicker.getClass();
        
         v.getChildren().addAll(lbl1,colorPicker,lbl2,colorPicker2,svg);
        Scene scene = new Scene(v, 400, 400);
        
        stage.setScene(scene);
        stage.show();
    }
}
