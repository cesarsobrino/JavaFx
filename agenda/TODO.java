/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.File;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author cesar
 */
public class TODO {
    
   
    
   

    static void mostrarTODO(Stage stage, File fichero, String ficheroo, String nombre, String sexoo, String color, Double cf) {
       
         MenuBar menubar=new MenuBar();
        Menu menu1=new Menu("Menu");
        MenuItem item1=new MenuItem("Insertar");
        MenuItem item2=new MenuItem("Listar");
        SeparatorMenuItem sepMen = new SeparatorMenuItem();
        MenuItem exit=new MenuItem("Exit");
        
        
        menu1.getItems().addAll(item1,item2,sepMen,exit);
        
        
        
        item1.setOnAction((t) -> {
            
                Label lbn=new Label("NOMBRE:");                
                TextField txtn=new TextField();
                
                Label lbs=new Label("SEXO:");
                String sexo[]={"H","M"};    
                ChoiceBox cb=new ChoiceBox();
                cb.setItems(FXCollections.observableArrayList(sexo));
                cb.valueProperty();
               
                
             Button btn_fichero = new Button("Abrir fichero");
             
             Label lbl_mostrar = new Label("");
             Label lbl_varios = new Label("");
              
        FileChooser fc = new FileChooser();
         
        Label lbnf=new Label("FOTO:");
       
        btn_fichero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                 File fichero;
                 String ficheroo="";
                fc.setTitle("Abrir Fichero");
                
                fichero=fc.showOpenDialog(stage);
                if (fichero != null) {
                   lbl_mostrar.setText(fichero.toString());
                    ficheroo=fichero.toString();
                }else{
                    lbl_mostrar.setText("No hay ficheros seleccionado.");
                }
                
            }
            
            
            
            
            
        });
        Label lblc=new Label("COLOR FAVORITO:");
        
            ColorPicker cl=new ColorPicker();
                
                
         Label lbli=new Label("NIVEL DE INGLES:");
         
             Slider ninvles = new Slider(0, 5, 0);
             ninvles.setShowTickLabels(true);
              ninvles.setShowTickMarks(true);
            
            
               
               
              
               
               
              
              Button btnfinal=new Button("Enviar");
              
              btnfinal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
            String nombre="";
            String sexoo="";
            String color="";
            Double cf=null;
                        nombre=txtn.getText().toString();
                        if(cb.getSelectionModel().getSelectedItem()=="H"){
            sexoo="H";
        }
        else if(cb.getSelectionModel().getSelectedItem()=="M"){
            sexoo="M";
        }
        
                        color=cl.getValue().toString();
                        cf=ninvles.getValue();

                        MeterDatos.insetarContacto(nombre,sexoo,ficheroo,color,cf);
                        
                                
                        
                        Stage ventana=new Stage();
                        
                        Label lbl=new Label("Se ha enviado con exito");
                        Button btn=new Button("Aceptar");
                        btn.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                ventana.close();
                            }
                        });
                        VBox v2=new VBox(30);
                        v2.getChildren().addAll(lbl,btn);
                
                        Scene escena2=new Scene(v2,200,100);
                        ventana.setScene(escena2);
                        ventana.show();
                        
                         }});
              
              
                VBox v=new VBox(30);
                v.getChildren().addAll(menubar,lbn,txtn,lbs,cb,lbnf,btn_fichero,lbl_mostrar,lblc,cl,lbli,ninvles,btnfinal);
                
                Scene escena=new Scene(v,400,700);
                stage.setScene(escena);
                stage.show();
        });
        item2.setOnAction((t) -> {
                
           ArrayList<Agenda> agnda=RecogerDatos.conseguirArray();
    
    TableView tv=new TableView();
      
      TableColumn<String, Agenda> columna1 = new TableColumn<>("FOTO");
      columna1.setCellValueFactory(new PropertyValueFactory<>("foto"));
      TableColumn<String, Agenda> columna2 = new TableColumn<>("NOMBRE");
      columna2.setCellValueFactory(new PropertyValueFactory<>("nombre"));
      TableColumn<String, Agenda> columna3 = new TableColumn<>("SEXO");
      columna3.setCellValueFactory(new PropertyValueFactory<>("sexo"));
      TableColumn<String, Agenda> columna4 = new TableColumn<>("NIVEL INGLES");
      columna4.setCellValueFactory(new PropertyValueFactory<>("n_ingles"));
      TableColumn<String, Agenda> columna5 = new TableColumn<>("COLOR FAVORITO");
      columna5.setCellValueFactory(new PropertyValueFactory<>("f_color"));
      tv.getColumns().add(columna1);
      tv.getColumns().add(columna2);
      tv.getColumns().add(columna3);
      tv.getColumns().add(columna4);
      tv.getColumns().add(columna5);
    
        for (Agenda p : agnda) {
            tv.getItems().add(p);
        }
             Label lbl=new Label("CONTACTOS");
                VBox v=new VBox(30);
                v.getChildren().addAll(menubar,lbl,tv);
                 
                Scene escena=new Scene(v,400,400);
                stage.setScene(escena);
                stage.show();
        });
        exit.setOnAction((t) -> {
            System.exit(0);
        });
        
        
        menubar.getMenus().addAll(menu1);
        
        
        
        ArrayList<Agenda> agnda=RecogerDatos.conseguirArray();
    
    TableView tv=new TableView();
      
      TableColumn<String, Agenda> columna1 = new TableColumn<>("FOTO");
      columna1.setCellValueFactory(new PropertyValueFactory<>("foto"));
      TableColumn<String, Agenda> columna2 = new TableColumn<>("NOMBRE");
      columna2.setCellValueFactory(new PropertyValueFactory<>("nombre"));
      TableColumn<String, Agenda> columna3 = new TableColumn<>("SEXO");
      columna3.setCellValueFactory(new PropertyValueFactory<>("sexo"));
      TableColumn<String, Agenda> columna4 = new TableColumn<>("NIVEL INGLES");
      columna4.setCellValueFactory(new PropertyValueFactory<>("n_ingles"));
      TableColumn<String, Agenda> columna5 = new TableColumn<>("COLOR FAVORITO");
      columna5.setCellValueFactory(new PropertyValueFactory<>("f_color"));
      tv.getColumns().add(columna1);
      tv.getColumns().add(columna2);
      tv.getColumns().add(columna3);
      tv.getColumns().add(columna4);
      tv.getColumns().add(columna5);
    
        for (Agenda p : agnda) {
            tv.getItems().add(p);
        }
       
        VBox v=new VBox(20);
        Label lbl=new Label("CONTACTOS");
        
        
        
              
                v.getChildren().addAll(menubar,lbl,tv);
                
                Scene escena=new Scene(v,400,400);
                stage.setScene(escena);
                stage.show();
    }

 
    
}
