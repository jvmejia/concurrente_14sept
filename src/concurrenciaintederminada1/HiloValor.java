package concurrenciaintederminada1;

public class HiloValor extends Thread{
	CompartirValor v;
	
	public HiloValor(CompartirValor valor) {
		v = valor;
	}
	public void run()
	{
		int i;
		for(i=0;i<1000;i++)
		{
			v.valor++;
		}
	}
}
