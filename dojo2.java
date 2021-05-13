class Cliente {

    int cpf;
    double saldo;
    String nome;

    //construtor
    public Cliente(int cpf, String nome){
        this.cpf=cpf;
        saldo=0;
        this.nome=nome;
    }

    //gets e sets
    public int getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }public void setNome(String nome) {
        this.nome = nome;
    }public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodos

    public boolean SaldoSuficiente(double valor){
        if(saldo>=valor){
            return true;
        } else {
            return false;
        }
    }

    public double Sacar(double valor){
        saldo-=valor;
        return saldo;
    }

    public double Depositar(double valor){
        saldo+=valor;
        return saldo;
    }
}

class ATM {

    int valorTotal;
    int notas10,notas20,notas50,notas100;

    //construtor

    public ATM(){
        notas10=500;
        notas20=500;
        notas50=250;
        notas100=250;

        valorTotal=((notas10*10)+(notas20*20)+(notas50*50)+(notas100*100));
    }

    //gets e sets

    public int getNotas10() {
        return notas10;
    }public int getNotas20() {
        return notas20;
    }public int getNotas50() {
        return notas50;
    }public int getNotas100() {
        return notas100;
    }
    public void setNotas10(int notas10) {
        this.notas10 = notas10;
    }public void setNotas20(int notas20) {
        this.notas20 = notas20;
    }public void setNotas50(int notas50) {
        this.notas50 = notas50;
    }public void setNotas100(int notas100) {
        this.notas100 = notas100;
    }

    //metodos

    public void Sacar(int valor){
        if(valor>valorTotal){
            System.out.println("Valor indisponível.");
        } else {
            
        }
    }

}

public class Main {
    public static void main(String[] args) {
        
    }
}
