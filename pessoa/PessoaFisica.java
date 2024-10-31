package pessoa;
 
 public class PessoaFisica{
    private String cpf;
    private String nome;
 
  public PessoaFisica(String cpf, String nome){
    this.cpf = cpf;
    this.nome = nome;
  }

 public String toString() {
    return "CPF: " + this.cpf + ", Nome"+ this.nome;
 }
}