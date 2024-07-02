package usbsystems.model;

public class Vendedor extends Funcionario{
    public double vendasSemenstrais;

    public Vendedor() {super();}

    public Vendedor(String nome, String cpf, Endereco endereco, double salarioFixo, double vendasSemenstrais) {
        super(nome, cpf, endereco, salarioFixo);
        this.vendasSemenstrais = vendasSemenstrais;
    }

    public double getVendasSemenstrais() {
        return vendasSemenstrais;
    }

    public void setVendasSemenstrais(double vendasSemenstrais) {
        this.vendasSemenstrais = vendasSemenstrais;
    }

    @Override
    public double getBonificacao() {
        return this.getVendasSemenstrais() * 0.015;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome()
                + "\nEndereco: " + this.getEndereco().getEnderecoCompleto()
                + "\nSalario: " + this.getSalarioFixo()
                + "\nVendas no semestre: R$" + this.getVendasSemenstrais()
                + "\nBonificação: " + this.getBonificacao();
    }
}
