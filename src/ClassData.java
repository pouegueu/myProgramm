import java.util.ArrayList;


public class ClassData {
	private String className;
	private ArrayList <ClassProperty> propertyList;

	public ClassData (){//Constructor
		
		this.propertyList = new ArrayList<ClassProperty>();

	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public ArrayList<ClassProperty> getPropertyList() {
		return propertyList;
	}
	public void setPropertyList(ArrayList<ClassProperty> propertyList) {
		this.propertyList = propertyList;
	}
	
}
