
import java.util.Scanner;

public class Cadastro {

    Scanner sc = new Scanner(System.in); Paciente p1 = new Paciente(); Medico m1 = new Medico(); Remedio r1 = new Remedio(); Consulta c1 = new Consulta(); Func f1 = new Func();

    public void cadastroPaciente() {
        System.out.println("Digite o nome do Paciente:"); p1.setNome(sc.nextLine());
        System.out.println("Digite a idade:"); p1.setIdade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o gênero:"); p1.setSexo(sc.nextLine());
    }

    public void imprimirPaciente() { p1.imprimeDados(); System.out.print("\n");}

    public void cadastroMedico() {
        System.out.println("Digite o nome do Médico:"); m1.setNome(sc.nextLine());
        System.out.println("Digite o indentificação local:"); m1.setIden(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o CRM:"); m1.setCrm(Integer.parseInt(sc.nextLine()));
        m1.setCargo("Médico");
    }

    public void imprimirMedico() { m1.imprimeDados(); System.out.print("\n");}

    public void cadastroRemedio() {
        System.out.println("Digite o nome do remédico:"); r1.setNome(sc.nextLine());
        System.out.println("Digite o codigo de barras:"); r1.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a descrição:"); r1.setDescricao(sc.nextLine());
    }
    public void cadastroFunc() {
        System.out.println("Digite o nome do Funcionário:"); f1.setNome(sc.nextLine());
        System.out.println("Digite o indentificação local:"); f1.setIden(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o Cargo:"); f1.setCargo(sc.nextLine());
    }

    public void imprimirFunc() { f1.imprimeDados(); System.out.print("\n");}

    public void imprimirRemedio() { r1.imprimeDados(); System.out.print("\n");}

    public void agendarConsulta() {
        String dia;
        System.out.println("Digite o dia da consulta:"); c1.setDia(sc.nextLine());
        System.out.println("Digite o horario da consulta: "); c1.setHora(sc.nextLine());
    }

    public void imprimirConsulta() {
        System.out.println("Consulta agendada:"); c1.imprimeDados(); p1.imprimeDados(); m1.imprimeDados(); System.out.println("");
        System.out.println("Ministrar medicação:"); r1.imprimeDados(); System.out.print("\n");
    }

}
