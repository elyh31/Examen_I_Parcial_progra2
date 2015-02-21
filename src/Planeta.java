
public class Planeta {

	private String nombre;
	private double diametro;
	private double gravedad;
	
	public Planeta (String nombre, double diametro, double gravedad)
	{
	this.nombre = nombre;
	this.diametro = diametro;
	this.gravedad = gravedad;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setDiametro(double diametro)
	{
		this.diametro = diametro;
	}
	
	public double getDiametro()
	{
		return diametro;
	}
	
	public void setGravedad(double gravedad)
	
	{
		this.gravedad = gravedad;
	}
	
	public double getGravedad()
	
	{
		return gravedad;
	}
}	
