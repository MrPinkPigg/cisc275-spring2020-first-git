public class Animal{
	String name;
	int numLegs;

	public Animal(String name, int numLegs){
		this.name = name;
		this.numLegs = numLegs;
	}

	public void setName(String name){ this.name = name; }
	public void setLegs(int numLegs){ this.numLegs = numLegs; }

	public String getName(){ return this.name; }
	public int getLegs(){ return this.numLegs; }
}