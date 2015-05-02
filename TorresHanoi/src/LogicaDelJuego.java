
public class LogicaDelJuego {
	
	
	private int movimientos = 0;
	
	public int moverdiscos(int num_discos, char A, char B, char C){
		
		if (num_discos == 1){
			
			moverdiscos(num_discos-1, A, C, B);
			movimientos ++;
			moverdiscos(num_discos-1, B, A, C);
					
		}
		else
		{
						
			moverdiscos(num_discos, A, B, C);
		}
		
		return movimientos;
	}
}
