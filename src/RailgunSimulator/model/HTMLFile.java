package RailgunSimulator.model;

import RailgunSimulator.controller.SimularRailgunController;
import java.io.FileNotFoundException;
import java.util.Formatter;
import RailgunSimulator.model.Railgun;
import RailgunSimulator.model.Segmento;
import com.sun.imageio.spi.RAFImageInputStreamSpi;
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
        String tabelaRGinicio;
        String tabelaRGfim;
        String linhaTitulo;
        String linhaRG;
        String linha1;
        
        tabelaRGinicio = " <table border=3> \n";

        linhaTitulo = "<tr> \n";
        linhaTitulo += "<td align=center colspan=13>  </b> </td> \n";
        linhaTitulo += "</tr> \n";

        linhaRG = "<tr> \n";
        linhaRG += "<td align=center> <b> Descricao </b> </td> \n";
        linhaRG += "<td align=center> <b> Numero de Segmentos </b> </td> \n";
        linhaRG += "<td align=center> <b> Forca (N/m) </b> </td> \n";
        linhaRG += "<td align=center> <b> Aceleracao do projectil (m/s^2) </b> </td> \n";
        linhaRG += "<td align=center> <b> Velocidade final\ndo proj&eacutectil </b> </td> \n";
        linhaRG += "</tr /n>";

        linha1 = "<tr>";
        linha1 += "<td> <b> Dados </b> </td>";
        linha1 += "<td align=center>" + info[0]+ "</td> \n";
         linha1 += "<td align=center>" + info[1]+ "</td> \n";
          linha1 += "<td align=center>" + info[2]+ "</td> \n";
           linha1 += "<td align=center>" + info[3]+ "</td> \n";
        linha1 += "</tr> \n";
        tabelaRGfim = "</table>";

        return inicioHtml() + inicioBody() + tabelaRGinicio + linhaTitulo + linhaRG
                + linha1 + tabelaRGfim + fimBody() + fimHtml();

    }

    }