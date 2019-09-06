
package dp06.structural.adapter;
//class which produces the voltage output
public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}
