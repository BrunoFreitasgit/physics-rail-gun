/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RailgunSimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Bruno Freitas
 */
public class Railgun {

    private ArrayList<Segmento> railgun = new ArrayList<Segmento>();

    public Railgun() {

    }

    public Railgun(ArrayList<Segmento> railgun) {
        this.railgun = railgun;
    }

    public ArrayList<Segmento> getRailgun() {
        return railgun;
    }

    public void setRailgun(ArrayList<Segmento> railgun) {
        this.railgun = railgun;
    }

   

    public void inserirSegmento(Segmento s) {
        railgun.add(s);
    }
    
    public void retirarSegmentoIndex(int index){
        railgun.remove(index);
    }
    
    public boolean primeiroElemento(){
        return this.railgun.isEmpty();
    }
    public Segmento getUltimoSegmento(){
        return this.railgun.get(this.railgun.size()-1);
    }
    public int getSize(){
        return this.railgun.size();
    }
}
