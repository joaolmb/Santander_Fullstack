package exemplosJava;

public class Teste {

	public static void main(String[] args) {
		
		// Usando um dos construtores que criamos
		Carro carro = new Carro();
		
		carro.setCor("Azul");
		carro.setModelo("BMW Serie 3");
		carro.setCapacidadeTanque(59);
		
		System.out.println(carro.getModelo());
		System.out.println(carro.getCor());
		System.out.println(carro.getCapacidadeTanque());
		System.out.println("O valor total para encher o tanque é: " + carro.calcularTotal(7.5) + "\n");
		
		
		// Usando o outro construtor que leva os atributos. Poderiamos ter criado com menos atributos também. (Sobrecarga)
		Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C" ,66);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println("O valor total para encher o tanque é: " + carro2.calcularTotal(7.5));
		}

}
