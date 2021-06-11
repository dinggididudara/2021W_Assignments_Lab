package KitchenSink;
import java.util.Scanner;

	class KitchenSinks{
	private String manufac; //manufacturer
	private String material;
	private double capacity;
	
	
	public String getManufac() {
		return manufac;
	}
	public void setManufac(String manufac) {
		this.manufac = manufac;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	}
	
	public class SoominLeeLabExam1Section303 {
		final static Scanner SC = new Scanner(System.in);
		
		public static void main(String[]args) {
			KitchenSinks ks = new KitchenSinks();
		
			System.out.println("What is sink's manufacturer?");
			String manufac = SC.nextLine();
		
			System.out.println("What is the material?");
			String material = SC.nextLine();
		
			System.out.println("How much capacity?");
			double capacity = SC.nextDouble();
		
			ks.setManufac(manufac);
			ks.setMaterial(material);
			ks.setCapacity(capacity);
		
			System.out.println("Manufacturer: " + ks.getManufac() + "\nMaterial: " + ks.getMaterial() +"\nCapacity:  "+ ks.getCapacity());
			System.out.println("Program by Soomin Lee");
		}
	}