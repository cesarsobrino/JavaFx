/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author cesar
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FP Mañana A
 */
class RecogerDatos {

    static ArrayList<Agenda> conseguirArray() {
       String ruta="D:\\TextoEclipse\\textos\\agenda2\\Agenda.csv";
       ArrayList<Agenda> lista=new ArrayList<>();
        File f=new File(ruta);
		FileReader fr=null;
		try {
			fr=new FileReader(ruta);
			BufferedReader br=new BufferedReader(fr);
			String linea=br.readLine();
			while(linea!=null)
			{
				
				
                                String [] dentro=linea.split(",");
                                Agenda c;
                            c = new Agenda(dentro[0], dentro[1], dentro[2],dentro[3], Float.parseFloat(dentro[4]));
                                lista.add(c);
                                linea=br.readLine();
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
                
                } catch (IOException ex) {
            Logger.getLogger(RecogerDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return lista;
        
    }
    
}
