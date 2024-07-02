package usbsystems.model;

public class Gerente extends Funcionario{

    public int sala;
    public int ramal;
    public double faturamentoSemestral;

    public Gerente() {super();}

    public Gerente(String nome, String cpf, Endereco endereco, double salarioFixo, int sala, int ramal, double faturamentoSemestral) {
        super(nome, cpf, endereco, salarioFixo);
        this.sala = sala;
        this.ramal = ramal;
        this.faturamentoSemestral = faturamentoSemestral;
    }

    public int getSala() {
        return sala;
    }

    public Gerente setSala(int sala) {
        this.sala = sala;
        return this;
    }

    public int getRamal() {
        return ramal;
    }

    public Gerente setRamal(int ramal) {
        this.ramal = ramal;
        return this;
    }

    public double getFaturamentoSemestral() {
        return faturamentoSemestral;
    }

    public Gerente setFaturamentoSemestral(double faturamentoSemestral) {
        this.faturamentoSemestral = faturamentoSemestral;
        return this;
    }

    @Override
    public double getBonificacao() {
        return this.getFaturamentoSemestral() * 0.05;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome()
                + "\nSala: " + this.getSala()
                + "\nRamal: " + this.getRamal()
                + "\nEndereco: " + this.getEndereco().getEnderecoCompleto()
                + "\nSalario Fixo: " + this.getSalarioFixo()
                + "\nFaturamento: " + this.getFaturamentoSemestral()
                + "\nBonificação: " + this.getBonificacao();
    }

}
