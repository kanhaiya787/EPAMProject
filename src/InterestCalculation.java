

/**
 * blueprint for calculating simple interest and compound interest 
 * @author kanhaiya787
 *
 */
public class InterestCalculation {
	
	
	float principle,Intrestrate,time;
	/**
	 * constructor initializes class data 
	 * @param principle
	 * @param Intrestrate
	 * @param time
	 */
	public InterestCalculation(float principle,float Intrestrate,float time) {
		this.principle=principle;
		this.Intrestrate=Intrestrate;
		this.time=time;
	}
	/**
	 * finds simple interest of existing class data instance
	 * @return double simple interest
	 */
	public double calcSimpleIntrest() {
		return (principle*time*Intrestrate)/100;
	}
	/**
	 * finds compound interest of existing class data instance
	 * @return double compound interest
	 */
	public double calcCompoundIntrest() {
		return principle * 
                (Math.pow((1 + Intrestrate / 100), time));
	}
}
