package taller3.televisores;

public class Control{
    TV tv;

    public void enlazar(TV nuevoTv){
        if(nuevoTv != null){
            tv = nuevoTv;
            nuevoTv.setControl(this);
        }
    }

    public void setTv(TV nuevoTv){
        enlazar(nuevoTv);
    }

    public TV getTv(){
        return tv;
    }

    public void setCanal(Integer nuevoCanal){
        if(tv != null){
            tv.setCanal(nuevoCanal);
        }
    }

    public void setVolumen(Integer nuevoVolumen){
        if(tv != null){
            tv.setVolumen(nuevoVolumen);
        }
    }

    public void turnOn(){
        if(tv != null){
            tv.turnOn();
        }
    }

    public void turnOff(){
        if(tv != null){
            tv.turnOff();
        }
    }

    public void canalUp(){
        if(tv != null){
            tv.canalUp();
        }
    }

    public void canalDown(){
        if(tv != null){
            tv.canalDown();
        }
    }

    public void volumenUp(){
        if(tv != null){
            tv.volumenUp();
        }
    }

    public void volumenDown(){
        if(tv != null){
            tv.volumenDown();
        }
    }

}