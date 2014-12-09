package RailgunSimulator.model;


import RailgunSimulator.model.Segmento;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 * 1,"RG",3,4,5 int pos,String nomenacao,int ouro, int prata, int bronze
 *
 * @author Bruno
 */
public class HTML {

    public HTML() throws FileNotFoundException {

        Formatter fout = new Formatter(new File("test.html"));
        String nc;
        nc = tabelaRanking();
        fout.format("%s", nc);
        fout.flush();
        fout.close();
    }

    public String inicioHtml() {
        return "<html>\n";
    }

    public String inicioBody() {
        return "<body>\n";
    }

    public String fimHtml() {
        return "</html>\n";
    }

    public String fimBody() {
        return "</body>\n";
    }

    private String tabelaRanking() {
        
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
        linhaRG += "<td align=center> <b>        </b> </td> \n";
        linhaRG += "<td align=center> <b> Segmento </b> </td> \n";
        linhaRG += "<td align=center> <b> Intensidade do\nCampo El&eacutectrico </b> </td> \n";
        linhaRG += "<td align=center> <b> Raio dos trilhos </b> </td> \n";
        linhaRG += "<td align=center> <b> Comprimento dos trilhos </b> </td> \n";
        linhaRG += "<td align=center> <b> Numero de Segmentos </b> </td> \n";
        linhaRG += "<td align=center> <b> Forc&ccedila (N/m) </b> </td> \n";
        linhaRG += "<td align=center> <b> Aceleração do projectil (m/s^2) </b> </td> \n";
        linhaRG += "<td align=center> <b>  </b> Velocidade final\ndo proj&eacutectil </td> \n";
        linhaRG += "</tr /n>";

        linha1 = "<tr>";
        linha1 += "<td> <b> Dados </b> </td>";
        linha1 += "<td align=center>" + "Segmento" + "</td> \n";
        linha1 += "<td align=center>" + "dadadsad" + "</td> \n";
        linha1 += "<td align=center>" + "getRaio_trilhos()" + "</td> \n";
        linha1 += "<td align=center>" + "Comprimento_trilhos" + "</td> \n";
        linha1 += "<td align=center>" + "getsegmento" + "</td> \n";
        linha1 += "<td align=center>" + "getForca" + "</td> \n";
        linha1 += "<td align=center>" + "getAceleraçao" + "</td> \n";
        linha1 += "<td align=center>" + "getVelocidadefinal" +"</td> \n";
        linha1 += "</tr> \n";
        tabelaRGfim = "</table>";

        return inicioHtml() + inicioBody() + tabelaRGinicio + linhaTitulo + linhaRG
                + linha1 + tabelaRGfim + fimBody() + fimHtml();

    }

    public static void main(String[] args) throws FileNotFoundException {
        HTML h1 = new HTML();
    }}