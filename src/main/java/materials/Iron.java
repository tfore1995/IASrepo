package materials;

public class Iron extends Material {

	String name;
	int weight;
	String source;
	String backstory;
	String img;
	
	public Iron() {
		this.name = "Iron";
		this.weight = 1;
		this.source = "surprise me";
		this.backstory = "doom";
		this.img = "mineral.jpg";
	}
}
