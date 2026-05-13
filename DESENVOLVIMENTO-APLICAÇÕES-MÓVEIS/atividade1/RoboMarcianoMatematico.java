class RoboMarcianoMatematico extends RoboMarciano {
    // Sobrecarga para suportar operações matemáticas
    public String responda(String operacao, double... numeros) {
        if (numeros.length < 2) return "Preciso de pelo menos dois números.";
        
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            switch (operacao.toLowerCase()) {
                case "some" -> resultado += numeros[i];
                case "subtraia" -> resultado -= numeros[i];
                case "multiplique" -> resultado *= numeros[i];
                case "divida" -> {
                    if (numeros[i] == 0) return "Erro: Divisão por zero!";
                    resultado /= numeros[i];
                }
                default -> { return super.responda(operacao); }
            }
        }
        return "O resultado é: " + resultado;
    }
}