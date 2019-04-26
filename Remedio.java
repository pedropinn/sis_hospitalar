public class Remedio {

    private String nome;private int codigo;private String descricao;

    public Remedio(String nome, int codigo, String descricao) {this.nome = nome;this.codigo = codigo;this.descricao = descricao;}

    public Remedio() {}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {
        if (codigo > 0) {this.codigo = codigo;}
        else {System.out.println("Codigo.");}
    }

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public void imprimeDados() {System.out.println("Remédio: " +getNome()+ " Descrição: "+getDescricao());System.out.println("Codigo de barras: " +getCodigo());}

}


