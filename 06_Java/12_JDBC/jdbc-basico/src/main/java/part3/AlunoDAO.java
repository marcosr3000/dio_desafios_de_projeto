package part3;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    // 1 - CONSULTA
    public List<Aluno> list() {
    //Preparar lista que irá retornar alunos após consultar o banco de dados

        List<Aluno> alunos = new ArrayList<>();

        try(ConnectionFactory.getConnection()){
            PreparedStatement prst = conn.prepareStatement("SELECT * FROM aluno");

            ResultSet rs = prst.executeQuery();

            while(rs.next()) {
                Aluno aluno = new Aluno(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("estado")
                );

                alunos.add();
            }

        } catch(Exception e) {

        }


        return alunos;
    }

}
