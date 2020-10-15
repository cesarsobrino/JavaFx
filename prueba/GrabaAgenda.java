/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FP Mañana A
 */
public class GrabaAgenda{   
    

    

    static void grabarPersona2(Agenda a) {
        String ruta="C:\\TextoNetbeans\\Agenda.csv";
        String linea=a.getNombre()+","+a.getCorreo()+","+a.getTelefono()+"\n";
    File f=new File(ruta);
        try {
            FileWriter fw=new FileWriter(f,true);
            fw.write(linea);
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(GrabaAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
