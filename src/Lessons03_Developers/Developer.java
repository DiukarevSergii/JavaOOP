package Lessons03_Developers;

public abstract class Developer {

	protected String name;
	protected double basicSalary;
	protected int experience;
	
	public Developer(String name, double basicSalary, int experience) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.experience = experience;
	}
	
	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public abstract double getSalary();

	@Override
	public String toString() {
		return "Developer{" +
				"basicSalary=" + basicSalary +
				", name='" + name + '\'' +
				", experience=" + experience +
				'}';
	}
}
