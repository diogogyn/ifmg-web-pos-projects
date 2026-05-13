class RoboMarciano {
    public String responda(String frase) {
        if (frase == null || frase.trim().isEmpty()) return "Não me incomode";
        
        boolean temEu = frase.toLowerCase().matches(".*\\beu\\b.*");
        boolean ehPergunta = frase.trim().endsWith("?");
        boolean gritando = frase.equals(frase.toUpperCase()) && frase.matches(".*[A-Z].*");

        if (gritando && ehPergunta) return "Relaxa, eu sei o que estou fazendo!";
        if (gritando) return "Opa! Calma aí!";
        if (ehPergunta) return "Certamente";
        if (temEu) return "A responsabilidade é sua";
        
        return "Tudo bem, como quiser";
    }
}