import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // arquivo com dados de entrada
            File file = new File("arquivoDados.txt");
            Scanner scanner = new Scanner(file);

            // leitura dos dados do cliente
            while (scanner.hasNextLine()) {
                // leia a próxima linha do arquivo
                String linha = scanner.nextLine();

                // quebrando a linha por ","
                String[] partes = linha.split(",");

                // exibindo cada dados dos clientes
                for (int i = 0; i < partes.length; i++) {
                    System.out.print(partes[i] + " - ");
                }
                System.out.println();

            }

            scanner.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
