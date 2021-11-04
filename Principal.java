import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Aluno a = new Aluno();
        Professor p = new Professor();
        
        //Com Scanner
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite seu nome: ");
        aluno.setNome(sc.nextLine());

        System.out.println("Digite seu CPF: ");
        aluno.setCpf(sc.nextLine());

        System.out.println("Digite seu endereço: ");
        aluno.setEndereco(sc.nextLine());

        System.out.println("Digite qual o seu Curso: ");
        aluno.setCursos(sc.nextLine());

        System.out.println("Digite qual sua nota da P1: ");
        aluno.setNota1(sc.nextDouble());

        System.out.println("Digite qual sua nota da P2: ");
        aluno.setNota2(sc.nextDouble());

        
        //Sem Scanner
        //Dados do aluno
        /*a.setNome("Kauê Oliveira");
        a.setEndereco("Rua das Larangeiras");
        a.setTelefone("99864-2504");
        a.setCpf("123.456.789-10");

        //Notas do aluno
        a.setCursos("Big Data");
        a.setNota1(9.0);
        a.setNota2(8.0);

        //Prints
        System.out.println("O aluno: ");
        System.out.println(a.getNome());
        System.out.println(a.getEndereco());
        System.out.println(a.getTelefone());
        System.out.println(a.getCpf());
        System.out.println(a.getCursos());*/

        if(aluno.verificaAprovado()==true){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}