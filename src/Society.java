import java.util.ArrayList;

public class Society{
	private String tipo;
	private int anioActual;
	private ArrayList<Person> personas;
	private int rMinAPP;
	private int rMaxAPP;
	private int eMinR;
	private int eMaxR;
	private float tasaDeMortalidad;
	private int ctrlBorns;
	private Resources resources;
	public void setTipo(String tipo) {
		 if ("Comunist".equalsIgnoreCase(tipo)){
		 	this.tipo=tipo;
		 }
		 if ("Capitalist".equalsIgnoreCase(tipo)){
		 	this.tipo=tipo;
		 }
	} 
	public int getAnioActual(){
		return anioActual;	
	}
	public void incAnioActual(){
		anioActual++;
	}
	public int getrMinAPP() {
		return rMinAPP;
	}
	public void setrMinAPP(int rMinAPP) {
		this.rMinAPP = rMinAPP;
	}
	public int getrMaxAPP() {
		return rMaxAPP;
	}
	public void setrMaxAPP(int rMaxAPP) {
		this.rMaxAPP = rMaxAPP;
	}
	public int geteMinR() {
		return eMinR;
	}
	public void seteMinR(int eMinR) {
		this.eMinR = eMinR;
	}
	public int geteMaxR() {
		return eMaxR;
	}
	public void seteMaxR(int eMaxR) {
		this.eMaxR = eMaxR;
	}
	public float getTasaDeMortalidad() {
		return tasaDeMortalidad;
	}
	public void setTasaDeMortalidad(float tasaDeMortalidad) {
		this.tasaDeMortalidad = tasaDeMortalidad;
	}
	public int getCtrlBorns() {
		return ctrlBorns;
	}
	public void setCtrlBorns(int ctrlBorns) {
		this.ctrlBorns = ctrlBorns;
	}
	public String getTipo() {
		return tipo;
	}
	public void setAnioActual(int anioActual) {
		this.anioActual = anioActual;
	}
	public void newYear() {
		
	}
	public void deaths() {
		
	}
	public void bigBang() {
		
	}
}