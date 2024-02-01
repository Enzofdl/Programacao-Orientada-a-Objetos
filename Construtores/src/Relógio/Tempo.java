package Relógio;

public class Tempo {
	private int hora, minuto, segundo;
	
	
	
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	
	
	
	
	
	
	
	
	private boolean verificahora(int h){
		if(h>23 || h<60) return false;
		return true;
	}
	private boolean verificams(int a){
		if(a>59 || a<0) return false;
				return true;
	}
	
	
	public Tempo(int h, int m, int s){
		if(verificahora(h)) hora = h;
		else hora = 0;
		if(verificams(m)) minuto = m;
		else m = 0;
		if(verificams(s)) segundo = s;
		else segundo = 0;
	}
	public Tempo(int h, int m) {
		if(verificahora(h)) hora = h;
		else hora = 0;
		if(verificams(m)) minuto = m;
		else m = 0;
	}
	public Tempo(int h) {
		if(verificahora(h)) hora = h;
		else hora = 0;
	}
	public Tempo(Tempo A){
		hora = A.getHora();
		minuto = A.getMinuto();
		segundo = A.getSegundo();
		
		//this(A.getHora(), A.getMinuto(), A.getSegundo());
	}
	public String retornaTempo() {
		String a;
		a = hora + "H" + minuto + "M" + "S" + "\n";
		return a;
	}
	private void incrementaH() {
		hora++;
		if(!(verificahora(hora))) hora = 0;
	}
	private void decrementaH() {
		hora--;
		if(!(verificahora(hora))) hora = 23;
		
		
	}
	public void incrementaM() {
		minuto ++;
		if(!(verificams(minuto))) {
			incrementaH();
			minuto = 0;
		}
		
	}
	public void decrementaM() {
		minuto --;
		if(!(verificams(minuto))) {
			decrementaH();
			minuto = 59;
		}
		
	}
	
	
	
}
