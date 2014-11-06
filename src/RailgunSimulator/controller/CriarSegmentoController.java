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
        this.s = new Segmento();
    }

    public void setS(Segmento s) {
        this.s = s;
    }

    
    public void inserirSegmento(Segmento s) {
        r.inserirSegmento(s);
    }

    public void calcularDados() {
        if (r.primeiroElemento()) {
            this.s.setVelocidade_inicial(0);
            this.s.setInducao_magnetica(Calculos.calcIntensidadeCampoMag(this.s.getIntensidade_camp_electrico(), this.s.getRaio_trilhos()));
            this.s.setForca(Calculos.calcForca(this.s.getIntensidade_camp_electrico(), this.s.getComprimento_trilhos(), this.s.getInducao_magnetica()));
            this.s.setAceleracao_projetil(Calculos.calcAcerelacao(this.s.getForca(), this.s.getMassa_projetil()));
            this.s.setVelocidade_final(Calculos.calcVelocidadeFinal(this.s.getVelocidade_inicial(), this.s.getAceleracao_projetil(), this.s.getComprimento_trilhos()));
        } else {
            this.s.setVelocidade_inicial(r.getUltimoSegmento().getVelocidade_final());
            this.s.setInducao_magnetica(Calculos.calcIntensidadeCampoMag(this.s.getIntensidade_camp_electrico(), this.s.getRaio_trilhos()));
            this.s.setForca(Calculos.calcForca(this.s.getIntensidade_camp_electrico(), this.s.getComprimento_trilhos(), this.s.getInducao_magnetica()));
            this.s.setAceleracao_projetil(Calculos.calcAcerelacao(this.s.getForca(), this.s.getMassa_projetil()));
            this.s.setVelocidade_final(Calculos.calcVelocidadeFinal(this.s.getVelocidade_inicial(), this.s.getAceleracao_projetil(), this.s.getComprimento_trilhos()));
        }
    }
    
    public void run(){
        calcularDados();
        inserirSegmento(this.s);
    }
}
