/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsiap_2014_2di_g04;

/**
 *
 * @author 1121248
 */
public class Segmento {
    private double ice; //itensidade campo eletrico
    private double icm; //itensidade campo magnetico
    private double massa; //massa do projetil
    private double dist_linhas; // distancia do centro do condutor ate a linha de campo
    private double comp_trilhos;
    private double permea_magnetica; //permeabilidade magnetica
    private double forca; //força do projectil
    private double velocidade_inicial;
    private double velocidade_final;
    private double acelaracao;
    

    public Segmento() {
        this.ice = 0;
        this.icm = 0;
        this.massa = 0;
        this.dist_linhas = 0;
        this.comp_trilhos = 0;
        this.permea_magnetica = 0;
        this.forca = 0;
        this.velocidade_inicial = 0;
        this.velocidade_final = 0;
        this.acelaracao = 0;
    }

    public Segmento(double ice, double icm, double massa, double dist_linhas, double comp_trilhos, double permea_magnetica) {
        this.ice = ice;
        this.icm = icm;
        this.massa = massa;
        this.dist_linhas = dist_linhas;
        this.comp_trilhos = comp_trilhos;
        this.permea_magnetica = permea_magnetica;
    }

    public Segmento(Segmento seg){
        this(seg.getIce(), seg.getIcm(), seg.getMassa(), seg.getDist_linhas(), seg.getComp_trilhos(), seg.getPermea_magnetica());
    }
    /**
     * @return the ice
     */
    public double getIce() {
        return ice;
    }

    /**
     * @param ice the ice to set
     */
    public void setIce(double ice) {
        this.ice = ice;
    }

    /**
     * @return the icm
     */
    public double getIcm() {
        return icm;
    }

    /**
     * @param icm the icm to set
     */
    public void setIcm(double icm) {
        this.icm = icm;
    }

    /**
     * @return the massa
     */
    public double getMassa() {
        return massa;
    }

    /**
     * @param massa the massa to set
     */
    public void setMassa(double massa) {
        this.massa = massa;
    }

    /**
     * @return the dist_linhas
     */
    public double getDist_linhas() {
        return dist_linhas;
    }

    /**
     * @param dist_linhas the dist_linhas to set
     */
    public void setDist_linhas(double dist_linhas) {
        this.dist_linhas = dist_linhas;
    }

    /**
     * @return the comp_trilhos
     */
    public double getComp_trilhos() {
        return comp_trilhos;
    }

    /**
     * @param comp_trilhos the comp_trilhos to set
     */
    public void setComp_trilhos(double comp_trilhos) {
        this.comp_trilhos = comp_trilhos;
    }

    /**
     * @return the permea_magnetica
     */
    public double getPermea_magnetica() {
        return permea_magnetica;
    }

    /**
     * @param permea_magnetica the permea_magnetica to set
     */
    public void setPermea_magnetica(double permea_magnetica) {
        this.permea_magnetica = permea_magnetica;
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
    public double getAcelaracao() {
        return acelaracao;
    }

    /**
     * @param acelaracao the acelaracao to set
     */
    public void setAcelaracao(double acelaracao) {
        this.acelaracao = acelaracao;
    }
    
    public double velocidadeProjetil(){
    icm = (permea_magnetica * ice)/(2*(3.14159265359)*dist_linhas);
    forca = ice*comp_trilhos*icm;
    acelaracao = forca / massa;
    velocidade_inicial = 0;
    velocidade_final = Math.sqrt(Math.pow(velocidade_inicial,2) + (2*acelaracao*comp_trilhos)) ;
    return velocidade_inicial; 
    
}
}
