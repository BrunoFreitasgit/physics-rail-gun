/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RailgunSimulator.model;

import RailgunSimulator.GUI.InserirMassaProjetil;

/**
 *
 * @author Bruno Freitas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Railgun r = new Railgun();
        InserirMassaProjetil janela = new InserirMassaProjetil(r);
        janela.setVisible(true);
//        DecimalFormat df = new DecimalFormat("#.##");
//        
//        Segmento s1 = new Segmento(1000, 0.05, 0.5, 8);
//        s1.setInducao_magnetica(Calculos.calcIntensidadeCampoMag(s1.getIntensidade_camp_electrico(), s1.getRaio_trilhos()));
//        s1.setForca(Calculos.calcForca(s1.getIntensidade_camp_electrico(), s1.getComprimento_trilhos(), s1.getInducao_magnetica()));
//        s1.setAceleracao_projetil(Calculos.calcAcerelacao(s1.getForca(), s1.getMassa_projetil()));
//        
//        System.out.println();
//        System.out.println(df.format(s1.getForca()) + " N");
//        System.out.println(df.format(Calculos.calcVelocidadeFinal(0, s1.getAceleracao_projetil(), s1.getComprimento_trilhos())) + " m/s");
    }

}
