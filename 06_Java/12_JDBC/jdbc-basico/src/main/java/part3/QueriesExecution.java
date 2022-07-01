package part3;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        //1 - CONSULTA

        List<Aluno> alunos = alunoDAO.list();

        alunos.stream().forEach(System.out::println);
    }
}
