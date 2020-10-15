/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author FP Mañana A
 */
public class MostrarTabla extends Application{

    
    public static void mostrarTabla1(){
         ArrayList<Agenda> agnda=RecogerDatos.conseguirArray();
    
    TableView tv=new TableView();
      
      TableColumn<String, Agenda> columna1 = new TableColumn<>("NOMBRE");
      columna1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
      TableColumn<String, Agenda> columna2 = new TableColumn<>("CORREO");
      columna2.setCellValueFactory(new PropertyValueFactory<>("correo"));
      TableColumn<String, Agenda> columna3 = new TableColumn<>("TELEFONO");
      columna3.setCellValueFactory(new PropertyValueFactory<>("telefono"));
      tv.getColumns().add(columna1);
      tv.getColumns().add(columna2);
      tv.getColumns().add(columna3);
    
        for (Agenda p : agnda) {
            tv.getItems().add(p);
        }
        Stage ventana=new Stage();
        ventana.setTitle("titulo");
        VBox v=new VBox(20);
        Label lbl=new Label("CONTACTOS");
        v.getChildren().addAll(lbl, tv);
        Scene escena =new Scene(v, 600, 600);
        ventana.setScene(escena);
        ventana.show();
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
   
}
