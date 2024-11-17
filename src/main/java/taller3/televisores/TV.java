package taller3.televisores;

public class TV{
    private Marca marca;
    private Boolean estado;
    private Control control;
    private Integer canal   = 1;
    private Integer volumen = 1;
    private Integer precio  = 500;

    private static Integer numTV;

    public TV(Marca marca, Boolean estado){
        this.marca = marca;
        this.estado = estado;
    }

    public void setMarca(Marca nuevaMarca){
        marca = nuevaMarca;
    }

    public Marca getMarca(){
        return marca;
    }

    public void setCanal(Integer nuevoCanal){
        if(this.estado && nuevoCanal >=1 && nuevoCanal <= 120){
            canal = nuevoCanal;
        }
    }

    public Integer getCanal(){
        return canal;
    }

    public void setPrecio(Integer nuevoPrecio){
        precio = nuevoPrecio;
    }

    public Integer getPrecio(){
        return precio;
    }

    public void setVolumen(Integer nuevoVolumen){
        if(this.estado && nuevoVolumen >= 0 && nuevoVolumen <= 7){
            volumen = nuevoVolumen;
        }
    }

    public Integer getVolumen(){
        return volumen;
    }

    public void setControl(Control nuevoControl){
        control = nuevoControl;
    }

    public Control getControl(){
        return control;
    }

    public static void setNumTV(Integer nuevoNumTV){
        TV.numTV = nuevoNumTV;
    }

    public static Integer getNumTV(){
        return TV.numTV;
    }

    public void turnOn(){
        estado = true;
    }

    public void turnOff(){
        estado = false;
    }

    public Boolean getEstado(){
        return estado;
    }

    public void canalUp(){
        this.setCanal(this.canal + 1);
    }

    public void canalDown(){
        this.setCanal(this.canal - 1);
    }

    public void volumenUp(){
        this.setVolumen(this.volumen + 1);
    }

    public void volumenDown(){
        this.setVolumen(this.volumen - 1);
    }
}