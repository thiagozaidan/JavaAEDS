

package prova_questao1;
import java.util.Scanner;

/**
 * PROVA I - 3° TRIMESTRE
 * Professora: Liliane dos Reis Gade
 * Aluno: Thiago Cassiano Campos Abreu
 * Turma: 203B
 * 10 pts.
 */
public class TesteBar {
  
    public void main(){
        Scanner sc = new Scanner(System.in);
        String nome_bar;
        String ender;
        int numero_mesa;
        int classeutilizada = 0;
        Bar ze = new Bar();
        System.out.println("Qual o nome do Bar: ");
        nome_bar = sc.nextLine();
        ze.getName();
        ze.setName(nome_bar);
        System.out.println("Qual o endereço do Bar: ");
        ender = sc.nextLine();
        ze.getAddress();
        ze.setAddress(ender);
        System.out.println();
        System.out.println("Bar do " + nome_bar);
        System.out.println(ender);
        System.out.println("Há quantas mesas no bar: ");
        int qtd_mesas = sc.nextInt();
        System.out.println("--------------------------");
        System.out.println("RESERVA");
        Mesa mesa = new Mesa();
        Date d = new Date();
        System.out.println("Qual o dia, o mês e o ano: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        d.getAno();
        d.getDia();
        d.getMes();
        d.setAno(year);
        d.setDia(day);
        d.setMes(month);
        mesa.getNumero_mesa();
        mesa.isReserva();
        System.out.println("Qual o número da mesa: ");
        numero_mesa = sc.nextInt();
        mesa.setNumero_mesa(numero_mesa);
        if(numero_mesa > 0 && numero_mesa <= qtd_mesas){
        mesa.setReserva(true);
        classeutilizada++;
        } else {
                System.out.println("Mesa indisponível ou inexistente");
                System.exit(0);
                }
            System.out.println("Mesa " + numero_mesa + " reservada com Sucesso no dia " + d.toString());
            System.out.println();
            System.out.println("ESPECIFICAÇÕES DO CLIENTE");
            System.out.println("Mesa: " + numero_mesa);
            System.out.println("Dia: " + d.toString());
            
            Cliente brow = new Cliente();
            
            System.out.println("Nome do cliente: ");
            String nomezinho = sc.next();
            brow.getNome();
            brow.setNome(nomezinho);
            System.out.println("CPF do cliente: ");
            String cpf = sc.next();
            brow.getCPF();
            brow.setCPF(cpf);
            System.out.println("E-mail do cliente: ");
            String email = sc.next();
            brow.getEmail();
            brow.setEmail(email);
            System.out.println("Endereço do cliente: ");
            String onde_ele_mora = sc.next();
            brow.getEndereco();
            brow.setEndereco(onde_ele_mora);
           
            if(classeutilizada > 0){
                Comanda comanda = new Comanda();
                System.out.println("-------COMANDA----------");
                System.out.println("---------- Bar do " + nome_bar + "--------------");
                System.out.println("Mesa: " + numero_mesa);
                System.out.println("Cliente: " + nomezinho);
                String consumo = comanda.listaConsumo();
                comanda.getConsumo();
                comanda.setConsumo(consumo);
                System.out.print("Valor da conta = ");
                double valor = sc.nextDouble();
                comanda.getValor();
                comanda.setValor(valor);
                
                double valorfinal = valor + comanda.dezPorCento();
                System.out.println("VALOR FINAL (com os 10% incluídos): " + valorfinal);
                
                System.out.println("Você deseja dividir a conta: [1] SIM [2] NÃO");
                int option = sc.nextInt();
                if(option == 1){
                    double vf = comanda.dividirConta();
                    System.out.println("VALOR DIVIDIDO: " + vf + "10%: " + comanda.dezPorCento());
                } else {
                    System.exit(0);
                }
            }
            
        }
    }
    

