import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Funcionalidade personalizada: Simulando um diagnóstico de sistema
        AcaoCustomizada autoDiagnostico = () -> {
            System.out.println("[SISTEMA] Escaneando hardware... OK");
            System.out.println("[SISTEMA] Nível de oxigênio em Marte: 0.13%");
            System.out.println("[SISTEMA] Status: Marciano está pronto para dominar o mundo.");
        };

        RoboMarcianoPremium robo = new RoboMarcianoPremium(autoDiagnostico);
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Marciano Online. Digite algo (ou 'FIM' para sair):");

        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("FIM")) break;

            // Lógica para decidir se chama a função matemática ou de texto
            if (entrada.matches("^(some|subtraia|multiplique|divida).*")) {
                String[] partes = entrada.split(" ");
                try {
                    double[] nums = new double[partes.length - 1];
                    for (int i = 0; i < nums.length; i++) nums[i] = Double.parseDouble(partes[i+1]);
                    System.out.println(robo.responda(partes[0], nums));
                } catch (Exception e) {
                    System.out.println("Formato inválido. Use: some 10 20");
                }
            } else {
                System.out.println(robo.responda(entrada));
            }
        }
        System.out.println("Conexão encerrada com Marte.");
        scanner.close();
    }
}
