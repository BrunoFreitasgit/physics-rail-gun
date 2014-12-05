/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RailgunSimulator.controller;

import RailgunSimulator.model.Calculos;
import RailgunSimulator.model.Railgun;
import RailgunSimulator.model.Segmento;

/**
 *
 * @author Bruno Freitas
 */
public class CriarSegmentoController {

    private Railgun r;
    
    private Segmento s;

    public CriarSegmentoController() {
    }
    
    public CriarSegmentoController(Railgun r) {
        this.r = r;
    }
    
    public void setS(Segmento s) {
        this.s = s;
    }
    
    public void inserirSegmento(Segmento s) {
        r.inserirSegmento(s);
    }
}
