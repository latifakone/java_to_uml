package devoir;

public abstract class Employé {
	
   private int ssNo;
   private String name;
   private int counter;
   Faculty Employé_faculty;
   
public int getSsNo() {
	return ssNo;
}
public void setSsNo(int ssNo) {
	this.ssNo = ssNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCounter() {
	return counter;
}
public void setCounter(int counter) {
	this.counter = counter;
}
   
   
}
