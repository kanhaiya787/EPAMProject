/**
 * Program to calculate the cost of the building	
 *depending on the type of material used
 * @author Kanhaiya787
 */
public class EstimatingCost {
	
	int materialType;
	double areaOfHouse;
	boolean isAutomated;
	
	/**
	 * constructor for the EstimatingCost class 
	 * job is to initialize class data
	 * @param materialType
	 * @param areaOfHouse
	 * @param isAutomated
	 */
	public EstimatingCost(int materialType,double areaOfHouse,boolean isAutomated) {
		this.areaOfHouse=areaOfHouse;
		this.materialType=materialType;
		this.isAutomated=isAutomated;
	}
	
	/**
	 * function to calculate the cost of the house
	 * depending on the class instance data
	 * @return double cost of the house
	 */
	public double findCost() {
		int cost = 0;
		if(materialType==0)
			cost = 1200;
		else if(materialType==1)
			cost = 1500;
		else if(materialType==2 && isAutomated)
			cost = 2500;
		else
			cost = 1800;
		return areaOfHouse*cost;
	}
}
