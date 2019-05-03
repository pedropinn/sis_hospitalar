import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cadastro c1 = new Cadastro();
        Scanner sc = new Scanner(System.in);
        int opcaomenu;

        do {
            System.out.println(" Digite a opçcão");
            System.out.println("  1 - Exibir Médico");
            System.out.println("  2 - Cadastro Médico");
            System.out.println("  3 - Exibir Paciente ");
            System.out.println("  4 - Cadastro Paciente");
            System.out.println("  5 - Exibir Remédio");
            System.out.println("  6 - Cadastro Remédio ");
            System.out.println("  7 - Exibir Funcionário ");
            System.out.println("  8 - Cadastro Funcionário ");
            System.out.println("  9 - Agendar consulta ");
            System.out.println(" 10 - Imprimir agendamento da consulta ");
            System.out.println(" 11 - Sair ");
            opcaomenu = sc.nextInt();
            System.out.print("\n");
            switch (opcaomenu) {
                case 1:
                    c1.imprimirMedico();break;
                case 2:
                    c1.cadastroMedico();break;
                case 3:
                    c1.imprimirPaciente();break;
                case 4:
                    c1.cadastroPaciente();break;
                case 5:
                    c1.imprimirRemedio();break;
                case 6:
                    c1.cadastroRemedio();break;
                case 7:
                    c1.imprimirFunc();break;
                case 8:
                    c1.cadastroFunc();break;
                case 9:
                    c1.agendarConsulta();break;
                case 10:
                    c1.imprimirConsulta();break;
                case 11:
                    System.exit(0);
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        } while (opcaomenu != 0);
    }
}
