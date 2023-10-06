
package t2.tpoo;


public class Mañana {
    private String nombre_mañana;

    public Mañana()
    {
        
    }

    public Mañana(String nombre_mañana) {
        this.nombre_mañana = nombre_mañana;
    }

    public String getNombre_mañana() {
        return nombre_mañana;
    }

    public void setNombre_mañana(String nombre_mañana) {
        this.nombre_mañana = nombre_mañana;
    }
    String getTexto()
    {
        return this.nombre_mañana;
    }
}
