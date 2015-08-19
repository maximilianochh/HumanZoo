import java.util.*;

public class Person 
{
	private final int recursoMinVital = 100;
	private int edad; 
	private String estado;
	private int recursosDisponibles;
	private float aptitud;
	private float sexAppeal;
	private boolean esterilidad;
	private int anioDeNacimiento;
	private int anioDeDefuncion;
	private ArrayList<Person> padres;
	private ArrayList<Person> hijos;
	private String sexo;
	private Random rnd; 
	
	public Person(String estado,int recursosDisponibles, float aptitud, 
			float sexAppeal, boolean esterealidad, int anioDeNacimiento,
			ArrayList<Person> padres, String sexo, int edadMax) {
		super();
		this.estado = "alive";
		this.addRecursosDisponibles(recursosDisponibles);
		this.setAptitud(aptitud);
		this.setSexAppeal(sexAppeal);
		this.setEsterilidad(esterealidad);
		this.setAnioDeNacimiento(anioDeNacimiento);
		this.setPadres(padres);
		this.setAnioDeNacimiento(anioDeNacimiento);
	}
	
	public int getEdad() {
		return edad;
	}

	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		if(this.estado != estado){
			if("death".equalsIgnoreCase(estado)){
				this.estado = estado;
			}
			else{
				System.out.println("estado mal ingresado");
			}
		}
	}	
	
	public int getRecursosDisponibles() {
		return recursosDisponibles;
	}
	
	public void addRecursosDisponibles(int recursosDisponibles) {
		this.recursosDisponibles += recursosDisponibles;
	}	
	
	public float getAptitud() {
		return aptitud;
	}
	public void setAptitud(float aptitud) {
		this.aptitud = aptitud;
	}	
	
	public float getSexAppeal(){
		return sexAppeal;
	}
	
	public void setSexAppeal(float sexAppeal) {
		sexAppeal = sexAppeal;
	}
	
	public int getAnioDeNacimiento() {
		return anioDeNacimiento;
	}
	
	public void setAnioDeNacimiento(int anioDeNacimiento) {
		if(anioDeNacimiento>0){
			anioDeNacimiento = anioDeNacimiento;
		}
	}
	
	
	public int getAnioDeDefuncion(){
		return anioDeDefuncion;
	}
	
	public void setAnioDeDefuncion(int anioDeDefuncion) {
		anioDeDefuncion = anioDeDefuncion;
	}	
	
	public ArrayList<Person> getPadres() {
		return padres;
	}
	
	public void setPadres(ArrayList<Person> padres) {
		if(padres.size()==2){
			if(padres.get(0).getSexo() != padres.get(1).getSexo()){
				padres = padres;
			}
		}
	}	
	
	public ArrayList<Person> getHijos() {
		return hijos;
	}
	
	public void setHijos(ArrayList<Person> hijos) {
		hijos = hijos;
	}	
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		sexo = sexo;
	}
	public boolean isEsteril() {
		return esterilidad;
	}
	
	public void setEsterilidad(boolean esterilidad) {
		this.esterilidad = esterilidad;
	}
	
	public void consume()
	{
		
	}
	
	public void kill()
	{
		if(randomDeath() || recursoMinVital > recursosDisponibles)
		{
			estado = "death";
		}
	}
	
	private boolean randomDeath()
	{
		rnd = new Random();
		int rndNum = (int)(rnd.nextDouble()*100+0);
		
		if(edad < 50)
		{
			return (rndNum == 50)?true:false; //1%
		}		
		else if (edad >= 50 && edad < 75){
			return (rndNum > 75)?true:false; //25%	
		} 
		else if (edad >= 75 && edad < 100){
			return (rndNum > 50)?true:false; //50%			
		} 
		else if (edad >= 100){
			return (rndNum > 10)?true:false; //90%			
		} 
		else {
			return false;
		}		
	}	
	/*
	public static void main(String[] args)
	{

	}
	*/
}
