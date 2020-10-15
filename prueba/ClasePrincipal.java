/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.plaf.SliderUI;

import javafx.application.Application;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class ClasePrincipal extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
        TextField tnombre;
        TextField tcorreo;
        TextField tnumero;
        Label texito;
          

       // ArrayList<Agenda> agenda=new ArrayList();
        
	@Override
	public void start(Stage window) throws Exception {
		Label lnombre=new Label("Nombre");
                 tnombre=new TextField();
                Label lcorreo=new Label("Correo");
                 tcorreo=new TextField();
                Label lnumero=new Label("Numero");
                 tnumero=new TextField();
                Button boton=new Button("Enviar");
                 texito=new Label("");
                Button botonmostrar=new Button("Mostrar contatos");
                
                boton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent t) {
                        
                        Agenda a=new Agenda(tnombre.getText(),tcorreo.getText(),tnumero.getText());
                         GrabaAgenda.grabarPersona2(a);
                                                  
                         tnombre.setText("");
                         tcorreo.setText("");
                         tnumero.setText("");
                         texito.setText("Enviado Con exito");
                         
                    }
                });
                
                botonmostrar.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent t) {
                         MostrarTabla.mostrarTabla1();
                    }
                });
                
                VBox v=new VBox(30);
                v.getChildren().addAll(lnombre,tnombre,lcorreo,tcorreo,lnumero,tnumero,boton,texito,botonmostrar);
                
                Scene escena=new Scene(v,300,600);
                window.setScene(escena);
                window.show();
                
                
	}

}