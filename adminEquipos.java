
package lab7;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class adminEquipos {
    private ArrayList<equipos>listaequipos=new ArrayList();
    private File ArchivoDeListaDeEquipos=null;

    public adminEquipos(String path) {
        ArchivoDeListaDeEquipos=new File(path);
        
    }

    public ArrayList<equipos> getListaequipos() {
        return listaequipos;
    }

    public void setListaequipos(ArrayList<equipos> listaequipos) {
        this.listaequipos = listaequipos;
    }

    public File getArchivoDeListaDeEquipos() {
        return ArchivoDeListaDeEquipos;
    }

    public void setArchivoDeListaDeEquipos(File ArchivoDeListaDeEquipos) {
        this.ArchivoDeListaDeEquipos = ArchivoDeListaDeEquipos;
    }


    
     //agregarEquipo
    public void setequipos(equipos e) {
        this.listaequipos.add(e);
    }
    @Override
    public String toString() {
        return "adminEquipos{" + "listaequipos=" + listaequipos + ", ArchivoDeListaDeEquipos=" + ArchivoDeListaDeEquipos + '}';
    }
    public void escritura()throws IOException{
        FileWriter escribir=null;
        BufferedWriter buffescri =null;
        
        try {
            escribir=new FileWriter(ArchivoDeListaDeEquipos,false);
            buffescri=new BufferedWriter(escribir);
        } catch (Exception e) {
            buffescri.flush();
        }
        escribir.close();
        buffescri.close();
    }
    public void guardar(){
        Scanner leer =new Scanner (System.in);
        
        if (ArchivoDeListaDeEquipos.exists()) {
            listaequipos=new ArrayList();
            try {
                leer=new Scanner(ArchivoDeListaDeEquipos);
                leer.useDelimiter("/");
                while (leer.hasNext()) {
                    listaequipos.add(new equipos(leer.next(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt()));
                }
                        
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Ups algo salio mal a la hora de cargar el archivo!");
            }
            leer.close();
            
        }
        
    }
    
    
    
}
