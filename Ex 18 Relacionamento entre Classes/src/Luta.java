public class Luta   {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desa) {
        this.desafiante = desa;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador de) {
        this.desafiado = de;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rou) {
        this.rounds = rou;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean apro) {
        this.aprovada = apro;
    }



    //Métodos /funções

    public void MarcarLutar(){
                if(desafiante.getCategoria().equals(desafiado.getCategoria())){
                } else if (desafiante != desafiado) {
                    setAprovada(true);
                    System.out.println("Luta entre" + desafiante.getNome() +" e "+ desafiado.getNome()+ " Aprovada!");
                }
    }
    public void Lutar() {
        if(getAprovada()){

        }
    }
}
