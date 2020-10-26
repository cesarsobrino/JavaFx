/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesar
 */
class MeterDatos {

    static void insetarContacto(String nombre, String sexoo, String ficheroo, String color, Double cf) {
        String ruta="D:\\TextoEclipse\\textos\\agenda2\\Agenda.csv";
        String linea="\n"+nombre+","+sexoo+","+ficheroo+","+color+","+cf;
    File f=new File(ruta);
        try {
            FileWriter fw=new FileWriter(f,true);
            fw.write(linea);
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(MeterDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

