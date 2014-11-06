/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RailgunSimulator.controller;

import RailgunSimulator.model.Railgun;
import RailgunSimulator.model.Segmento;
import java.text.DecimalFormat;

/**
 *
 * @author Bruno Freitas
 */
public class SimularRailgunController {

    private Railgun r;

    public SimularRailgunController() {
    }

    public SimularRailgunController(Railgun railgun) {
        this.r = railgun;
    }

    public int getNumeroSegmentos() {
        return this.r.getSize();
    }

    public String[] getInfo() {
  
        String arr[] = new String[4];
        Segmento segmentoFinal = this.r.getUltimoSegmento();
        arr[0] = Double.toString(this.r.getSize());
        arr[1] = Double.toString((Math.round(segmentoFinal.getForca()*10000)/10000.0d));
        arr[2] = Double.toString((Math.round(segmentoFinal.getAceleracao_projetil()*10000)/10000.0d));
        arr[3] = Double.toString((Math.round(segmentoFinal.getVelocidade_final()*10000)/10000.0d));
        return arr;
    }
}
