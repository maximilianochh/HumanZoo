import java.util.ArrayList;

public class Person {
	private int edad;
	private String estado;
	private int RecursosDisponibles;
	private float aptitud;
	private float SexAppeal;
	private boolean esterilidad;
	private int AnioDeNacimiento;
	private int AnioDeDefuncion;
	private ArrayList<Person> Padres;
	private ArrayList<Person> Hijos;
	private String Sexo;
	public Person(String estado,int recursosDisponibles, float aptitud, float sexAppeal, boolean esterealidad, int anioDeNacimiento,
			ArrayList<Person> padres, String sexo, int edadMax) {
		super();
		this.addRecursosDisponibles(recursosDisponibles);
		this.setAptitud(aptitud);;
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
			}else{
				System.out.println("estado mal ingresado");
			}
		}
	}
	
	
	public int getRecursosDisponibles() {
		return RecursosDisponibles;
	}
	public void addRecursosDisponibles(int recursosDisponibles) {
		this.RecursosDisponibles += recursosDisponibles;
	}
	
	
	public float getAptitud() {
		return aptitud;
	}
	public void setAptitud(float aptitud) {
		this.aptitud = aptitud;
	}
	
	
	public float getSexAppeal(){
		return SexAppeal;
	}
	public void setSexAppeal(float sexAppeal) {
		SexAppeal = sexAppeal;
	}
	public int getAnioDeNacimiento() {
		return AnioDeNacimiento;
	}
	public void setAnioDeNacimiento(int anioDeNacimiento) {
		if(anioDeNacimiento>0){
			AnioDeNacimiento = anioDeNacimiento;
		}
	}
	
	
	public int getAnioDeDefuncion(){
		return AnioDeDefuncion;
	}
	
	public void setAnioDeDefuncion(int anioDeDefuncion) {
		AnioDeDefuncion = anioDeDefuncion;
	}
	
	
	public ArrayList<Person> getPadres() {
		return Padres;
	}
	public void setPadres(ArrayList<Person> padres) {
		if(padres.size()==2){
			if(padres.get(0).getSexo() != padres.get(1).getSexo()){
				Padres = padres;
			}
		}
	}
	
	
	public ArrayList<Person> getHijos() {
		return Hijos;
	}
	public void setHijos(ArrayList<Person> hijos) {
		Hijos = hijos;
	}
	
	
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public boolean isEsterilidad() {
		return esterilidad;
	}
	public void setEsterilidad(boolean esterilidad) {
		this.esterilidad = esterilidad;
	}	
}

