/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RailgunSimulator.model;

/**
 *
 * @author Bruno Freitas
 */
public class Calculos {

    public static final double PERMEABILIDADE_MAGNETICA = (1.26 * (Math.pow(10, -6)));

    public static double calcForca(double intensidade_camp_eletrico, double comprimento_trilhos, double inducao_magnetica) {
        double f = (intensidade_camp_eletrico * comprimento_trilhos * inducao_magnetica);
        return f;
    }

    public static double calcIntensidadeCampoMag(double intensidade_camp_electrico, double distancia_centro) {
        double intensidade_mag = (PERMEABILIDADE_MAGNETICA * intensidade_camp_electrico) / (2 * Math.PI * distancia_centro);
        return intensidade_mag;
    }

    public static double calcAcerelacao(double forca, double massa) {
        double a = (forca / massa);
        return a;
    }
    public static double calcVelocidadeFinal(double velocidade_inicial, double aceleracao_projetil, double distancia) {
        return Math.sqrt((Math.pow(velocidade_inicial, 2) + 2*(aceleracao_projetil * distancia)));
    }

}
