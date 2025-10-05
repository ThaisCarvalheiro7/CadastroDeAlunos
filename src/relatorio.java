public class relatorio {
    public void exibeRelatorio(aluno estudante){
        System.out.println("nome: "+estudante.nome+"\n");
        System.out.println("nota 1: "+estudante.nota1+"\n");
        System.out.println("nota 2: "+estudante.nota2+"\n");
        System.out.println("resultado: "+estudante.mediaAluno()+"\n");
        System.out.println("--------------------------------------------------------");

    }
}
