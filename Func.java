
public class Func {

    private String nome; private int iden; private String cargo;

    public Func(String nome, int iden, String cargo) {this.nome = nome;this.iden = iden;this.cargo = cargo;}

    public Func() {}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCargo() {return cargo;}

    public void setCargo(String cargo) {this.cargo = cargo;}

    public int getIden() {return iden;}

    public void setIden(int iden) {
        if (iden > 0) {this.iden = iden;}
        else {System.out.println("Identificação Inválida.");}
    }

    public void imprimeDados() { System.out.println(getCargo() + ": " + getNome());System.out.println("Id: " + getIden());}

}
