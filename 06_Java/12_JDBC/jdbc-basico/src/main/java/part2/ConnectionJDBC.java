package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) throws SQLException {

        // 1 - BAIXAR O DRIVER PARA O BANCO DE DADOS

//        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
//
//        try (Connection conn = DriverManager.getConnection(urlConnection, "root", "123456")) {
//            System.out.println("SUCESSO!");
//        } catch (Exception e){
//            System.out.println("FALHA!");
//            e.printStackTrace();
//        }

//-------------------------------------------------------------------------------------------

        //2 - DEFINIR PARÂMETROS PARA SE CONECTAR AO BANDO DE DADOS MYSQL

        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "root";
        String password = "123456";

        //3 - CONSTRUÇÃO DA STRING DE CONEXÃO

        StringBuilder sb = new StringBuilder("jdbc:")
            .append(driver).append("://")
            .append(dataBaseAddress).append("/")
            .append(dataBaseName);

        String connectionUrl = sb.toString();

        //4 - CRIAR CONEXÃO USANDO O DRIVE MANAGER, PASSANDO COMO PARÂMETROS A STRING DE CONEXAO, USUÁRIO E SENHA

        try(Connection conn = DriverManager.getConnection(connectionUrl, "root", "123456")) {
            System.out.println("SUCESSO");
        } catch (SQLException e) {
            System.out.println("FALHA");
            e.printStackTrace();
        }
    }
}
