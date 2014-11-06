/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RailgunSimulator.model;

/**
 * A classe Segmento permite a simulação de um
 *
 * @author 1121248
 */
public class Segmento {

    private double intensidade_camp_electrico; //intensidade campo eletrico
    private double inducao_magnetica; //intensidade campo magnetico
    private double massa_projetil; //massa do projetil
    private double raio_trilhos; // distancia do centro do condutor ate a linha de campo
    private double comprimento_trilhos;
    private double forca; //força do projectil
    private double velocidade_inicial;
    private double velocidade_final;
    private double aceleracao_projetil;

    public Segmento() {
        this.intensidade_camp_electrico = 0;
        this.inducao_magnetica = 0;
        this.massa_projetil = 0;
        this.raio_trilhos = 0;
        this.comprimento_trilhos = 0;
        this.forca = 0;
        this.velocidade_inicial = 0;
        this.velocidade_final = 0;
        this.aceleracao_projetil = 0;
    }

    public Segmento(double ice, double massa, double dist_linhas, double comp_trilhos) {
        this.intensidade_camp_electrico = ice;
        this.inducao_magnetica = Calculos.calcIntensidadeCampoMag(ice, dist_linhas);
        this.massa_projetil = massa;
        this.raio_trilhos = dist_linhas;
        this.comprimento_trilhos = comp_trilhos;
        this.forca = 0;
        this.velocidade_inicial = 0;
        this.velocidade_final = 0;
        this.aceleracao_projetil = 0;
    }

    public Segmento(Segmento seg) {
        this(seg.getIntensidade_camp_electrico(), seg.getMassa_projetil(), seg.getRaio_trilhos(), seg.getComprimento_trilhos());
        this.inducao_magnetica = seg.getInducao_magnetica();
    }

    /**
     * @return the ice
     */
    public double getIntensidade_camp_electrico() {
        return intensidade_camp_electrico;
    }

    /**
     * @param intensidade_camp_electrico the ice to set
     */
    public void setIntensidade_camp_electrico(double intensidade_camp_electrico) {
        this.intensidade_camp_electrico = intensidade_camp_electrico;
    }

    /**
     * @return the icm
     */
    public double getInducao_magnetica() {
        return Calculos.calcIntensidadeCampoMag(this.intensidade_camp_electrico, this.raio_trilhos);
    }

    /**
     * @param inducao_magnetica the icm to set
     */
    public void setInducao_magnetica(double inducao_magnetica) {
        this.inducao_magnetica = inducao_magnetica;
    }

    /**
     * @return the massa
     */
    public double getMassa_projetil() {
        return massa_projetil;
    }

    /**
     * @param massa_projetil the massa to set
     */
    public void setMassa_projetil(double massa_projetil) {
        this.massa_projetil = massa_projetil;
    }

    /**
     * @return the dist_linhas
     */
    public double getRaio_trilhos() {
        return raio_trilhos;
    }

    /**
     * @param raio_trilhos the dist_linhas to set
     */
    public void setRaio_trilhos(double raio_trilhos) {
        this.raio_trilhos = raio_trilhos;
    }

    /**
     * @return the comp_trilhos
     */
    public double getComprimento_trilhos() {
        return comprimento_trilhos;
    }

    /**
     * @param comprimento_trilhos the comp_trilhos to set
     */
    public void setComprimento_trilhos(double comprimento_trilhos) {
        this.comprimento_trilhos = comprimento_trilhos;
    }

    /**
     * @return the forca
     */
    public double getForca() {
        return forca;
    }

    /**
     * @param forca the forca to set
     */
    public void setForca(double forca) {
        this.forca = forca;
    }

    /**
     * @return the velocidade
     */
    public double getVelocidade_inicial() {
        return velocidade_inicial;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade_inicial(double velocidade) {
        this.velocidade_inicial = velocidade;
    }

    public double getVelocidade_final() {
        return velocidade_final;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade_final(double velocidade) {
        this.velocidade_final = velocidade;
    }

    /**
     * @return the acelaracao
     */
    public double getAceleracao_projetil() {
        return aceleracao_projetil;
    }

    /**
     * @param aceleracao_projetil the acelaracao to set
     */
    public void setAceleracao_projetil(double aceleracao_projetil) {
        this.aceleracao_projetil = aceleracao_projetil;
    }
    
    @Override
    public String toString() {
        String descricao = "Intensidade do Campo Elétrico: " + this.intensidade_camp_electrico + "N/C" +
                "\nRaio dos trilhos: " + this.raio_trilhos + "m" + 
                "\nComprimento dos trilhos: " + this.comprimento_trilhos + "m" +
                "\nMassa do projétil: " + this.massa_projetil + "kg" + 
                "\n***********************************************************";  
        return descricao;
    }
}
