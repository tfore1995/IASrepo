package materials;

public class Stone extends Material {

	String name;
	int weight;
	String source;
	String backstory;
	String img;
	
	public Stone() {
		this.name = "Stone";
		this.weight = 1;
		this.source = "surprise me";
		this.backstory = "doom";
		this.img = "mineral.jpg";
	}
}
