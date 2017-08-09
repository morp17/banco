package persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public Conexao() {
		try {
			// Necess�rio para utilizar o driver JDBC do MySQL
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// Erro de driver JDBC
			e.printStackTrace();
		}
	}

	protected Connection getConnection() throws SQLException {
		// URL de conex�o com o banco de dados
		String url = "jdbc:mysql://127.0.0.1:3306/banco";
		// Conecta utilizando a URL, usu�rio e senha.
		Connection conn = DriverManager.getConnection(url, "root", "");
		return conn;
	}

	public static void main(String[] args) throws SQLException {
		Conexao db = new Conexao();
		// Testa a conex�o
		Connection conn = db.getConnection();
		System.out.println(conn);
	}
}
