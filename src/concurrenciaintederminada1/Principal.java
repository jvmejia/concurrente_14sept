package concurrenciaintederminada1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompartirValor val = new CompartirValor();
		HiloValor [] Hilos = new HiloValor[1000];
		
		int i;
		for(i=0;i<Hilos.length; i++) 
		{
			Hilos[i] = new HiloValor(val);
			Hilos[i].start();
			try {
				Hilos[i].join();
			}catch(Exception e){}
		}
	/*	try
		{
			for(i=0;i<Hilos.length;i++)
			{
				Hilos[i].join();
			}
		}catch(Exception e) {}*/
	System.out.println("El valor fue de " + val.valor);
	}

}
