
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeiaCVS {

  public static void main(String[] args){
    menu();
}

public static void menu() { // Menu de opções para o usuário

    System.out.println("Digite o número da opção abaixo \n");
    System.out.println("1 - Consultar medicamentos pelo nome ");
    System.out.println("2 - Buscar pelo código de barras ");
    System.out.println("3 - Comparativo da LISTA DE CONCESSÃO DE CRÉDITO TRIBUTÁRIO (PIS/COFINS) ");
    System.out.println("4 - Sair do programa\n");
    System.out.println("Opcão:");

    int option;
    option = menuOption();

    switch (option){ // Permite que execute a opção de escolha
        case 1:
            parteUm();
            System.out.println();
            break;
        case 2:
            parteDois();
            System.out.println();
            break;
        case 3:
            parteTres();
            System.out.println();
            break;
        case 4:
            sair();
            System.out.println();
            break;
        default: // Caso use um usuário caracter inválido 
            System.out.println("Você digitou uma opção inválida, por favor, digite um número de 1 a 4");
            menu();
            break;
    }
    menu();
}

    public static int menuOption(){
        int option;
        try{   
            // Bloco de código para o programa tentar rodar em primeiro lugar
            Scanner sc = new Scanner(System.in);
            System.out.println();
            option = sc.nextInt();
        } catch (Exception exception) {
            // Bloco de código para rodar em caso de erro, ou seja, quando não for um int
            System.out.println("Você não digitou um número, por favor, digite um número novamente.");
            menu();
            option = menuOption();
        }
        return option;
    }

       public static void parteUm() {

        String arquivoCSV = "TA_PRECO_MEDICAMENTO.csv"; //Seleciona arquivoCSV
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";
        String nome;

        try {

            br = new BufferedReader(new FileReader(arquivoCSV)); //leitor do arquivoCSV
            Scanner sc = new Scanner(System.in); //Usuário informa o nome da susbtância
                  System.out.println("\nDigite o nome do rémedio:\n");
                  nome = sc.nextLine();
                  
                  
            while ((linha = br.readLine()) != null) {

                String[] pais = linha.split(csvDivisor);
                
                String doisMil = pais[pais.length -2]; //Selecionar os valores da seção 2020 do arquivoCSV
                

                 if(linha.contains(nome.toUpperCase()) &&  pais[pais.length -2].equals("Sim")) { 
                   System.out.println("\n"+linha);
                 }
                // Ver se alguma linha do excel contém o nome digitado pelo usuário e se o produto é comercializado em 2020
                  
            }

        } catch (FileNotFoundException e) { //tratamento de erros
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

      public static void parteDois(){
        String arquivoCSV = "TA_PRECO_MEDICAMENTO.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";
        String codigo;

        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            Scanner sc = new Scanner(System.in);
                  System.out.println("\nDigite o código de barras:\n");
                  codigo = sc.nextLine(); //atribui o valor dado pelo usuário
                  
                  
            while ((linha = br.readLine()) != null) {
            

                String[] pais = linha.split(csvDivisor);
                String pmc = pais[pais.length -9 -8]; //seleciona os valores da seção PMC 0%
                
                 if(linha.contains(codigo)) {
                    System.out.println("\n"+linha); 
                 }
                
                   //7899640809806

            }

            

        } catch (FileNotFoundException e) { //tratamento de erros
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

      public static void parteTres(){}

      public static void sair() { //sair do programa
        System.out.println("\nVocê escolheu sair do programa");
        System.exit(4);
    }
}
