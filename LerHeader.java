import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class LerHeader {
    public static void main(String[] args) {
        
        String file = "TA_PRECO_MEDICAMENTO.csv";
        String headers;
        String line;
        String nome;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            Scanner sc = new Scanner(System.in);
               System.out.println("\nDigite o nome do rémedio:\n");
               nome = sc.nextLine();
            headers = br.readLine();
            while((line = br.readLine()) != null){
        
                if(line.contains(nome.toUpperCase())) {
                    System.out.println("\n"+line);
                }
             
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
}
