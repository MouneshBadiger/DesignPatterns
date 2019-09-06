
package dp31.behavioral.templateMethod;

public abstract class HouseTemplate {

	//template method, final so subclasses can't override
	public final void buildHouse(){
		this.buildFoundation();
		this.buildPillars();
		this.buildWalls();
		this.buildWindows();
		System.out.println("House is built.");
	}

	//default implementation
	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}

	//methods to be implemented by subclasses
	public abstract void buildWalls();
	public abstract void buildPillars();
}
