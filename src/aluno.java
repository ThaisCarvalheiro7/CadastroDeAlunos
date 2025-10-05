import java.util.Scanner;

public class aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double media;


    public void cadastrarAluno() {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome do estudante: ");
            nome = sc.next();

            System.out.println("Digite a nota 1 do estudante: ");
            nota1 = sc.nextInt();

            System.out.println("Digite a nota 2 do estudante: ");
            nota2 = sc.nextInt();
        System.out.println("--------------------------------------------------------------------------------");

    }
    public String mediaAluno(){
        double media = (double)(nota1 + nota2) / 2;

        if (media > 7){
            return "Aprovado!";
        } else if (media >= 5) {
            return "Recuperação!";
        }else {
            return "Reprovado!";
        }
    }

}



