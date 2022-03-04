
package lab7;


public class equipos {
    private String nombreequipo;
    private int partidos_perdidos;
    private int partidos_ganados;
    private int partidos_empatados;
    private int golesEnContra;
    private int golesAFavor;
    private int cantidadPuntos;
    private int difertenciadegoles;

    public equipos(String nombreequipo, int partidos_perdidos, int partidos_ganados, int partidos_empatados, int golesEnContra, int golesAFavor, int cantidadPuntos, int difertenciadegoles) {
        this.nombreequipo = nombreequipo;
        this.partidos_perdidos = partidos_perdidos;
        this.partidos_ganados = partidos_ganados;
        this.partidos_empatados = partidos_empatados;
        this.golesEnContra = golesEnContra;
        this.golesAFavor = golesAFavor;
        this.cantidadPuntos = cantidadPuntos;
        this.difertenciadegoles = difertenciadegoles;
    }

    equipos(String nombreEquipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public int getPartidos_perdidos() {
        return partidos_perdidos;
    }

    public void setPartidos_perdidos(int partidos_perdidos) {
        this.partidos_perdidos = partidos_perdidos;
    }

    public int getPartidos_ganados() {
        return partidos_ganados;
    }

    public void setPartidos_ganados(int partidos_ganados) {
        this.partidos_ganados = partidos_ganados;
    }

    public int getPartidos_empatados() {
        return partidos_empatados;
    }

    public void setPartidos_empatados(int partidos_empatados) {
        this.partidos_empatados = partidos_empatados;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public int getDifertenciadegoles() {
        return difertenciadegoles;
    }

    public void setDifertenciadegoles(int difertenciadegoles) {
        this.difertenciadegoles = difertenciadegoles;
    }

    @Override
    public String toString() {
        return "equipos{" + "nombreequipo=" + nombreequipo + ", partidos_perdidos=" + partidos_perdidos + ", partidos_ganados=" + partidos_ganados + ", partidos_empatados=" + partidos_empatados + ", golesEnContra=" + golesEnContra + ", golesAFavor=" + golesAFavor + ", cantidadPuntos=" + cantidadPuntos + ", difertenciadegoles=" + difertenciadegoles + '}';
    }
    
          
    
}
