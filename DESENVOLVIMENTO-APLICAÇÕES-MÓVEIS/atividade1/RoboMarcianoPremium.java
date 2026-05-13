class RoboMarcianoPremium extends RoboMarcianoMatematico {
    private final AcaoCustomizada acao;

    public RoboMarcianoPremium(AcaoCustomizada acao) {
        this.acao = acao;
    }

    @Override
    public String responda(String frase) {
        if (frase.toLowerCase().contains("agir")) {
            acao.executar();
            return "É pra já!";
        }
        return super.responda(frase);
    }
}