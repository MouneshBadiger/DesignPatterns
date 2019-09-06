
package dp03.creational.abstractFactory;

import dp02.creational.factory.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
