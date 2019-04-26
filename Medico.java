public class Medico extends Func{
    private int crm;


    public Medico(String nome, int iden, String cargo, int crm) {super(nome, iden, cargo ="médico"); this.crm = crm;}

    public Medico() {super();}

    public int getCrm() {return crm;}

    public void setCrm(int crm) {
        if (crm>0) {this.crm = crm;}
        else {System.out.println("CRM Inválido.");}
        }

    public void imprimeDados(){super.imprimeDados();System.out.println("CRM: "+getCrm());}
}
