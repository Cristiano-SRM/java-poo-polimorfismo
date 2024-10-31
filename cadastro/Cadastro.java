package cadastro;

public class Cadastro{
    int cont, quantidade;
    PessoaFisica[] pessoas;

    public cadastro (int quantidade){
        this.cont=0;
        this.quantidade=quantidade;
        pessoas = new PessoaFisica[quantidade];
    }
    public void cadastrar(PessoaFisica PessoaFisica){
       if (this.cont > this.quantidade){
        pessoas[cont++] = pessoaFisica;
       }
       public String tostring(){
        String mensagem = "--- pessoas cadastradas";
        for(PessoaFisica pessoaFisica : pessoas){
            mensagem += pessoaFisica.tostring() +"\n";
            return mensagem;
        }
       }
    }
}
