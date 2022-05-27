

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeiaCVS {

  public static void main(String[] args) {
      System.out.println("\f");

    LeiaCVS obj = new LeiaCVS();
    obj.run();

  }

  public void run() {

    String arquivoCSV = "TA_PRECO_MEDICAMENTO.csv";
    BufferedReader br = null;
    String linha = "";
    String csvDivisor = ";";
    try {

        br = new BufferedReader(new FileReader(arquivoCSV));
        while ((linha = br.readLine()) != null) {

            String[] pais= linha.split(csvDivisor);

            System.out.println("\nMedicamentos [SUBSTÂNCIA = " + pais[pais.length -9 -9 -9 -9 -4] 
                                 + " , CNPJ = " + pais[pais.length-9 -9 -9 -9 -3] 
                                 + " , LABORATÓRIO = " + pais[pais.length-9 -9 -9 -9 -2] 
                                 + " , CÓDIGO GGREM = " + pais[pais.length-9 -9 -9 -9 -1] 
                                 + " , REGISTRO = " + pais[pais.length -9 -9 -9 -9] 
                                 + " , EAN 1 = " + pais[pais.length -9 -9 -9 -8] 
                                 + " , EAN 2 = " + pais[pais.length -9 -9 -9 -7] 
                                 + " , EAN 3 = " + pais[pais.length -9 -9 -9 -6] 
                                 + " , PRODUTO = " + pais[pais.length -9 -9 -9 -5] 
                                 + " , APRESENTAÇÃO = " + pais[pais.length -9 -9 -9 -4] 
                                 + ", CLASSE TERAPÊUTICA = " + pais[pais.length -9 -9 -9 -3] 
                                 + ", TIPO DE PRODUTO (STATUS DO PRODUTO) = " + pais[pais.length -9 -9 -9 -2] 
                                 + ", REGIME DE PREÇO = " + pais[pais.length -9 -9 -9 -1] 
                                 + ", PF Sem Impostos = " + pais[pais.length -9 -9 -9] 
                                 + ", PF 0% = " + pais[pais.length -9 -9 -8] 
                                 + ", PF 12% = " + pais[pais.length -9 -9 -7] 
                                 + ", PF 17% = " + pais[pais.length -9 -9 -6] 
                                 + ", PF 17% ALC = " + pais[pais.length -9 -9 -5] 
                                 + ", PF 17,5% = " + pais[pais.length -9 -9 -4] 
                                 + ", PF 17,5% ALC = " + pais[pais.length -9 -9 -3] 
                                 + ", PF 18% = " + pais[pais.length -9 -9 -2] 
                                 + ", PF 18% ALC = " + pais[pais.length -9 -9 -1] 
                                 + ", PF 20% = " + pais[pais.length -9 -9] 
                                 + ", PMC 0% = " + pais[pais.length -9 -8] 
                                 + ", PMC 12% = " + pais[pais.length -9 -7] 
                                 + ", PMC 17% = " + pais[pais.length -9 -6] 
                                 + ", PMC 17% ALC = " + pais[pais.length -9 -5] 
                                 + ", PMC 17,5% = " + pais[pais.length -9 -4] 
                                 + ", PMC 17,5% ALC = " + pais[pais.length -9 -3] 
                                 + ", PMC 18% = " + pais[pais.length -9 -2] 
                                 + ", PMC 18% ALC = " + pais[pais.length -9 -1] 
                                 + ", PMC 20% = " + pais[pais.length -9] 
                                 + ", RESTRIÇÃO HOSPITALAR = " + pais[pais.length -8] 
                                 + ", CAP = " + pais[pais.length -7] 
                                 + ", CONFAZ 87 = " + pais[pais.length -6] 
                                 + ", ICMS 0% = " + pais[pais.length -5] 
                                 + ", ANÁLISE RECURSAL = " + pais[pais.length -4] 
                                 + ", LISTA DE CONCESSÃO DE CRÉDITO TRIBUTÁRIO (PIS/COFINS) = " + pais[pais.length -3] 
                                 + ", COMERCIALIZAÇÃO 2020 = " + pais[pais.length -2] 
                                 + ", TARJA = " + pais[pais.length -1] 
                                 + "]");

        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  }
}
