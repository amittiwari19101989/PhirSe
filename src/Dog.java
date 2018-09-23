
public class Dog {
private	String Breed;
private	int Age;
private	String Color;
	public void setBreed(String breed) {this.Breed=breed;}
	public void setAge(int age) {this.Age=age;}
	public void setColor (String color) {this.Color=color;}
	public String getBreed() {
		return Breed;
	}
	public String getColor() {
		return Color;
	}	
	public int getAge() {
		return Age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d = new Dog();
d.setAge(15);
d.setBreed("kutta");
d.setColor("kala");
System.out.println("color is"+d.getColor()+"breed id"+d.getBreed() +"age is" +d.getAge());

	}

}
