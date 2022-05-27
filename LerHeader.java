import java.io.BufferedReader;
import java.io.FileReader;



public class LerHeader {
    public static void main(String[] args) {
        String file = "TA_PRECO_MEDICAMENTO.csv";
        String headers;
        String line;;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            headers = br.readLine();
            while((line = br.readLine()) != null){
               System.out.println("\n"+line);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
    }
}