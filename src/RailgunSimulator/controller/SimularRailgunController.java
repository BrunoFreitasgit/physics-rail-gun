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
public class SimularRailgunController {

    private Railgun r;
    public SimularRailgunController() {
    }

    public SimularRailgunController(Railgun railgun) {
        this.r = railgun;
    }
    
    public Railgun getRailgun(){
        
        return this.r;
        
    }

    public int getNumeroSegmentos() {
        return this.r.getSize();
    }

    public void simular(double massa) {
        r.setMassa(massa);
        int tamanho = this.r.getSize();
        int primeiro = 0;
        for (int i = 0; i < tamanho; i++) {
            Segmento s = r.getSegmentoAt(i);
            if (primeiro == 0) {
                s.setVelocidade_inicial(0);
                s.setInducao_magnetica(Calculos.calcIntensidadeCampoMag(s.getIntensidade_camp_electrico(), s.getRaio_trilhos()));
                s.setForca(Calculos.calcForca(s.getIntensidade_camp_electrico(), s.getComprimento_trilhos(), s.getInducao_magnetica()));
                s.setAceleracao_projetil(Calculos.calcAcerelacao(s.getForca(), this.r.getMassa()));
                s.setVelocidade_final(Calculos.calcVelocidadeFinal(s.getVelocidade_inicial(), s.getAceleracao_projetil(), s.getComprimento_trilhos()));
                primeiro = -1;
            } else {
                s.setVelocidade_inicial(r.getSegmentoAt(i-1).getVelocidade_final());
                s.setInducao_magnetica(Calculos.calcIntensidadeCampoMag(s.getIntensidade_camp_electrico(), s.getRaio_trilhos()));
                s.setForca(Calculos.calcForca(s.getIntensidade_camp_electrico(), s.getComprimento_trilhos(), s.getInducao_magnetica()));
                s.setAceleracao_projetil(Calculos.calcAcerelacao(s.getForca(), this.r.getMassa()));
                s.setVelocidade_final(Calculos.calcVelocidadeFinal(s.getVelocidade_inicial(), s.getAceleracao_projetil(), s.getComprimento_trilhos()));
            }
        }
    }

    public String[] getInfo() {
        String arr[] = new String[4];
        Segmento segmentoFinal = this.r.getUltimoSegmento();
        arr[0] = Double.toString(this.r.getSize());
        arr[1] = Double.toString((Math.round(segmentoFinal.getForca() * 100) / 100.0d));
        arr[2] = Double.toString((Math.round(segmentoFinal.getAceleracao_projetil() * 100) / 100.0d));
        arr[3] = Double.toString((Math.round(segmentoFinal.getVelocidade_final() * 100) / 100.0d));
        
        return arr;
        
                
    }
}
