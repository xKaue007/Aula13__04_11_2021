
public class Principal{
    public static void main(String[] args){
        Aluno a = new Aluno();
        Professor p = new Professor();

        //Dados do aluno
        a.setNome("Kauê Oliveira");
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
        System.out.println(a.getCursos());

        if(a.verificaAprovado()){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}