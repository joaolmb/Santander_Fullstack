package funcionarios;

public class Teste {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		Funcionario gerente = new Gerente();
		Funcionario faxineiro = new Faxineiro();
		Funcionario vendedor = new Vendedor();
		
		
		// Evitar downcast porque geralmente vai dar erro. O erro � parecido com o de tipos primitivos onde o int cabe no double, mas o double n�o cabe no int
		Vendedor vendedor_ = (Vendedor) new Funcionario();

	}

}
