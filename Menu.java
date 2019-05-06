import java.util.Scanner;
public class Menu {
    private int numeroMenu = 0;

    public void txtMenu() {
        System.out.println("Digite a opçcão");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Exibir Médico");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Cadastro Médico");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Exibir Paciente");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Cadastro Paciente");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Exibir Remédio");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Cadastro Paciente");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Exibir Funcionário");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Cadastro Funcionário");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Agendar Consulta");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Imprimir Consulta");
        ++numeroMenu;
        System.out.println(numeroMenu + " - Sair\n");
        ++numeroMenu;
    }

    public void txtErro() {
        System.out.println("Opção inválida");
    }

    public void menu() {
        int opcaoMenu;
        Cadastro c1 = new Cadastro();
        Scanner sc = new Scanner(System.in);
        do {
            txtMenu();
            opcaoMenu = sc.nextInt();
            System.out.print("\n");
            switch (opcaoMenu) {

                case 1:
                    c1.imprimirMedico();
                    break;
                case 2:
                    c1.cadastroMedico();
                    break;
                case 3:
                    c1.imprimirPaciente();
                    break;
                case 4:
                    c1.cadastroPaciente();
                    break;
                case 5:
                    c1.imprimirRemedio();
                    break;
                case 6:
                    c1.cadastroRemedio();
                    break;
                case 7:
                    c1.imprimirFunc();
                    break;
                case 8:
                    c1.cadastroFunc();
                    break;
                case 9:
                    c1.agendarConsulta();
                    break;
                case 10:
                    c1.imprimirConsulta();
                    break;
                case 11:
                    System.exit(0);
                default:
                    txtErro();
                    break;
            }
        } while (opcaoMenu != 0);
    }
}