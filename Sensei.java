
//The constructor order for this is:
//name, lastName,personality, gender, belt, handsome, height

public class Sensei{
	//Variables are defined here
	private String name,lastName,personality,gender,belt;
	private boolean handsome;
	//Height is in cm, salary is in pesos/hr
	private float height,salary;

	//Default constructor
	public Sensei(){
		this.name = "N/A";
		this.lastName = "N/A";
		this.personality = "N/A";
		this.gender = "N/A";
		this.belt = "N/A";
		this.handsome = false;
		this.height = 0;
		this.salary = 0;
	}
	//Actually Good Constructor
	public Sensei(String name, String lastName, String personality, String gender, String belt, boolean handsome, float height){
		this.name = name;
		this.lastName = lastName;
		this.personality = personality;
		this.gender = gender;
		this.belt = belt;
		this.handsome = handsome;
		this.height = height;
		switch(this.belt){
			case "white belt": this.salary = 100;
				break;
			case "red belt": this.salary = 150;
				break;
			case "black belt": this.salary = 200;
				break;
			case "product dev": this.salary = 250;
				break;
			default: this.salary = 0;
				break;
		}
	}
	//Get anything
	public String getName(){
		return name;
	}
	public String getLastName(){
		return lastName;
	}
	public String getPersonality(){
		return personality;
	}
	public String getGender(){
		return gender;
	}
	public String getBelt(){
		return belt;
	}
	public boolean getHandsome(){
		return handsome;
	}
	public float getHeight(){
		return height;
	}
	public float getSalary(){
		updateSalary();
		return salary;
	}

	//Set anything

	public void setName(String arg){
		this.name = arg;
	}
	public void setLastName(String arg){
		this.lastName = arg;
	}
	public void setPersonality(String arg){
		this.personality = arg;
	}
	public void setGender(String arg){
		this.gender = arg;
	}
	public void setBelt(String arg){
		this.belt = arg;
		updateSalary();
	}
	public void setHandsome(boolean arg){
		this.handsome = arg;
	}
	public void setHeight(float arg){
		this.height = arg;
	}

	//Actually useful methods
	public String getFullName(){
		return String.format("%s %s",name,lastName);
	}
	public float getSalaryTenPercent(){
		return this.salary/10;
	}
	public float getNetSalary(){
		return this.salary - getSalaryTenPercent();
	}
	public void updateSalary(){
		switch(this.belt){
			case "white belt": this.salary = 100;
				break;
			case "red belt": this.salary = 150;
				break;
			case "black belt": this.salary = 200;
				break;
			case "product development": this.salary = 250;
				break;
			default: this.salary = 0;
				break;
		}
	}
	public String handsomeOrNot(){
		if(this.handsome){
			return "very";
		}
		else{
			return"not";
		}
	}
	public String fullIntro(){
		return String.format(
			"This sensei is %s, a pretty %s %s.\n"
			+"Their course is %s.\n"
			+"They are %s handsome.\n"
			+"Their height is %f.\n"
			+"They earn %f pesos per hour.",
			this.getFullName(),
			this.personality,
			this.gender,
			this.belt,
			this.handsomeOrNot(), 
			this.height,
			this.getNetSalary());
	}
}