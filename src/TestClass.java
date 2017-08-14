
public class TestClass {

	public static void main(String[] args) {
		String s = "    eingenschaft : typ";
		String[] array = s.split(":");
		for(int i=0; i<array.length; i++) {
		  System.out.println(array[i].trim());
		}
		System.out.println(array.length);
	}

}
