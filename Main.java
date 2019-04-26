
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cadastro c1 = new Cadastro(); Scanner sc = new Scanner(System.in);
        int opcaomenu;

        do {
            System.out.println(" Digite a opçcão");
            System.out.println(" 1 - Médico");
            System.out.println(" 2 - Paciente ");
            System.out.println(" 3 - Remédio ");
            System.out.println(" 4 - Cadastro Médico  ");
            System.out.println(" 5 - Cadastro Paciente ");
            System.out.println(" 6 - Cadastro Remédio ");
            System.out.println(" 7 - Agendar consulta ");
            System.out.println(" 8 - Imprimir agendamento consulta ");
            System.out.println(" 9 - Sair ");
            opcaomenu = sc.nextInt();
            System.out.print("\n");
            switch (opcaomenu) {
                case 1:
                    c1.imprimirMedico(); break;
                case 2:
                    c1.imprimirPaciente();break;
                case 3:
                    c1.imprimirRemedio();break;
                case 4:
                    c1.cadastroMedico();break;
                case 5:
                    c1.cadastroPaciente();break;
                case 6:
                    c1.cadastroRemedio();break;
                case 7:
                    c1.agendarConsulta();break;
                case 8:
                    c1.imprimirConsulta();break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Opção Inválida.");break;
            }
        } while (opcaomenu != 0);
    }
}
