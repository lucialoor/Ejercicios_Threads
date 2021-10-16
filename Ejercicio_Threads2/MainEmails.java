package Ejercicio_Threads2;

public class MainEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferEmails buffer = new BufferEmails();
		
		ProductorEmails p1 = new ProductorEmails("Productor 1", buffer);
		ProductorEmails p2 = new ProductorEmails("Productor 2", buffer);
		ProductorEmails p3 = new ProductorEmails("Productor 3", buffer);
		
		p1.setName("Hilo productor 1");
		p2.setName("Hilo productor 2");
		p3.setName("Hilo productor 3");
		
		ConsumidorEmails c1 = new ConsumidorEmails("Consumidor 1", buffer); 
		ConsumidorEmails c2 = new ConsumidorEmails("Consumidor 2", buffer); 
		
		p1.start();
		p2.start();
		p3.start();
		
		c1.start();
		c2.start();
		
		c1.setName("Hilo consumidor 1.");
		c2.setName("Hilo consumidor 2");
		
		
		
	}

}
