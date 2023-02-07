
public class TestaCarro {
	public static void main(String[] args) {
		System.out.println("Teste dos elses do contrutor da classse carro:");
		Carro carro = new Carro(1016,null,-66); 
		
		System.out.println("-----------------");
		
		Carro carro2 = new Carro(2019,"Fiat Uno",25000);
		System.out.println("Ano do Carro2: "+ carro2.getAno());
		
		
	}
}
