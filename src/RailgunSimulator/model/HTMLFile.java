package RailgunSimulator.model;

import RailgunSimulator.controller.SimularRailgunController;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.ArrayList;
import RailgunSimulator.model.Railgun;
import RailgunSimulator.model.Segmento;
import java.io.File;

public class HTMLFile {
    
    String file;
    
    
    /**
     * Constructor by default.
     */
   public HTMLFile(){
        this.file = "output.html";
    }
    
    
     void setOutputFile(String file){
        this.file = file;
    }
    
    public void novoFicheiro(SimularRailgunController r ) throws FileNotFoundException {

        Formatter fout = new Formatter(new File("teste.html"));
        String nc;
        nc = tabelaRanking(r);
        fout.format("%s", nc);
        fout.flush();
        fout.close();
    }

    String inicioHtml() {
        return "<html>\n";
    }

    String inicioBody() {
        return "<body>\n";
    }

    String fimHtml() {
        return "</html>\n";
    }

    String fimBody() {
        return "</body>\n";
    }

    private String tabelaRanking(SimularRailgunController r) {
        String []info = r.getInfo();
        Railgun rail = new Railgun();
        rail = r.getRailgun();
        
      
        int lenght = rail.getSize();
        /*CICLO LENGTH*/
        Segmento seg = new Segmento();
        
        
        String tabelaRGinicio;
        String tabelaRGfim;
        String linhaTitulo;
        String linhaRG;
        String linha1;
        /*DADOS SEGMENTOS*/
        String linhaDescricao;
        String linha3 = "";
        
        
        tabelaRGinicio = " <table border=3> \n";

        linhaTitulo = "<tr> \n";
        linhaTitulo += "<td align=center colspan=13>  </b> </td> \n";
        linhaTitulo += "</tr> \n";
        
        linhaDescricao = "<tr>";
        linhaDescricao += "<td align=center> <b> Resultados Finais </b> </td> \n";
        linhaDescricao += "<td align=center> <b> Segmento N </b> </td> \n";
        
        linhaDescricao += "<td align=center> <b> Forca (N)</b> </td> \n";
        linhaDescricao += "<td align=center> <b> Comprimento dos Trilhos (m)</b> </td> \n";
        linhaDescricao += "<td align=center> <b> Raio dos Trilhos (m) </b> </td> \n";
        linhaDescricao += "<td align=center> <b> Aceleracao do projectil (m/s^2) </b> </td> \n";
        linhaDescricao += "<td align=center> <b> Velocidade final\ndo proj&eacutectil (m/s) </b> </td> \n";
        linhaDescricao += "<td align=center> <b> Velocidade inicial\ndo proj&eacutectil (m/s) </b> </td> \n";
        
        linhaDescricao += "</tr /n>";
        
        for (int i = 0; i < lenght ; i++) {
            seg = rail.getSegmentoAt(i);
            String linha2;
            linha2 = "<tr>";
              linha2 += "<td align=center> <b> Dados </b>  </td> \n";
        linha2 += "<td align=center>  "+(i+1)+" </td> \n";
       
        linha2 += "<td align=center>  "+ seg.getForca()+"  </td> \n";
         linha2 += "<td align=center>  "+ seg.getComprimento_trilhos()+ "  </td> \n";
         linha2 += "<td align=center>  "+ seg.getRaio_trilhos()+" </td> \n";
        linha2 += "<td align=center>  "+ seg.getAceleracao_projetil() + "  </td> \n";
        linha2 += "<td align=center>  "+ seg.getVelocidade_final()+"  </td> \n";
        linha2 += "<td align=center>  "+ seg.getVelocidade_inicial()+"  </td> \n";
        
        linha2 += "</tr /n>";
        linha3 += linha2;
            
        }
        
         linhaRG = "<tr> \n";
        linhaRG += "<td align=center> <b> Descricao </b> </td> \n";
        linhaRG += "<td align=center> <b> Numero de Segmentos </b> </td> \n";
        linhaRG += "<td align=center> <b> Forca (N) </b> </td> \n";
        linhaRG += "<td align=center> <b>   </b> </td> \n";
        linhaRG += "<td align=center> <b>   </b> </td> \n";
       
        
        linhaRG += "<td align=center> <b> Aceleracao do projectil (m/s^2) </b> </td> \n";
        linhaRG += "<td align=center> <b> Velocidade final\ndo proj&eacutectil (m/s) </b> </td> \n";
        linhaRG += "</tr /n>";

        linha1 = "<tr>";
        linha1 += "<td align=center> <b> Dados </b> </td> \n";
        linha1 += "<td align=center>" + info[0]+ "</td> \n";
        linha1 += "<td align=center>" + info[1]+ "</td> \n";
        linha1 += "<td align=center></td> \n";
        linha1 += "<td align=center></td> \n";
        linha1 += "<td align=center>" + info[2]+ "</td> \n";
        linha1 += "<td align=center>" + info[3]+ "</td> \n";
        linha1 += "</tr> \n";
        tabelaRGfim = "</table>";
        
        
        
        
        return inicioHtml() + inicioBody() + tabelaRGinicio + linhaTitulo + linhaDescricao
                + linha3 + linhaRG + linha1 + tabelaRGfim + fimBody() + fimHtml();

    }

    }