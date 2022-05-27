import java.util.Scanner;
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
    String nome;
    try {

        br = new BufferedReader(new FileReader(arquivoCSV));
        Scanner sc = new Scanner(System.in);
               System.out.println("\nDigite o nome do rémedio:\n");
               nome = sc.nextLine();
               
               
        while ((linha = br.readLine()) != null) {

            String[] pais= linha.split(csvDivisor);

              if(linha.contains(nome.toUpperCase())) {
                   System.out.println("\n"+linha);
               }
               
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
