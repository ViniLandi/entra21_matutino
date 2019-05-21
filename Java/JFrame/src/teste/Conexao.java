package teste;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Conexao() {
		 
    }
	
	public static Connection getConexao() {
		boolean status = false;
		Connection connection = null;
	try { 
	Class.forName("com.mysql.jdbc.Driver");
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDVini","root","");
	
		if (connection != null) {
			
			status = true;
			
		} else {
			
			status = false;
			
		}
	            return connection;
	            
	        } catch (ClassNotFoundException e) {
	            System.out.println("O driver expecificado nao foi encontrado.");
	            return null;
	        } catch (SQLException e) {
	            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
	            return null;
	        }
	    }
	 
	
	
	    public static boolean FecharConexao() {
	        try {
	        	Conexao.getConexao().close();
	            return true;
	        } catch (SQLException e) {
	            return false;
	        }
	        
	        
	        
	    } public static java.sql.Connection ReiniciarConexao() {
	        FecharConexao();
	        return Conexao.getConexao();
	    }
	 
	
}
