public class Paciente {

    private String nome;private int idade;private String sexo;

    public Paciente(String nome, int idade, String sexo) {this.nome = nome;this.idade = idade;this.sexo = sexo;}

    public Paciente() {}

    public void setNome(String nome) {this.nome = nome;}

    public String getNome() {return nome;}

    public void setIdade(int idade) {
        if (idade > 0) {this.idade = idade;}
        else {System.out.println("Idade Inválida.");}
    }

    public int getIdade() {return idade;}

    public void setSexo(String sexo) {this.sexo = sexo;}

    public String getSexo() {return sexo;}


    public void imprimeDados(){System.out.println("Paciente: " + getNome());System.out.println("Sexo: " + getSexo());System.out.println("Idade: " + getIdade());}
}
