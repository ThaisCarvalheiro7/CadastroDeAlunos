import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        relatorio relatorioAluno = new relatorio();

    aluno estudante1 = new aluno();
    aluno estudante2 = new aluno();
    aluno estudante3 = new aluno();
    aluno estudante4 = new aluno();
    aluno estudante5 = new aluno();

        estudante1.cadastrarAluno();
        estudante2.cadastrarAluno();
        estudante3.cadastrarAluno();
        estudante4.cadastrarAluno();
        estudante5.cadastrarAluno();

        System.out.println("----------------------------------------------------------------");
        System.out.println("===== RELATÓRIO =====");
        relatorioAluno.exibeRelatorio(estudante1);
        relatorioAluno.exibeRelatorio(estudante2);
        relatorioAluno.exibeRelatorio(estudante3);
        relatorioAluno.exibeRelatorio(estudante4);
        relatorioAluno.exibeRelatorio(estudante5);

    }
}