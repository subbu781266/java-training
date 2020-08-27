public class StudentDatabase {



public static void main(String[] args) {

Student student1 = new Student("Susan", "74223798");



student1.enroll();

student1.pay(5000);

student1.setPhone("+62 7668725");

student1.setCity("Bandung");

student1.setState("West Java");

System.out.println(student1.toString());

student1.showCourses();

}

}



class Student {

// Properties of student

private String name;

private String SSN;

private String email;

private static int ID = 1000;

private String userID; // Combination of Static ID + random 4 digit (1000-9000) + last 4 digit SSN

private double balance;

private String phone;

private String city;

private String state;

// Constructor

public Student(String name, String SSN){

this.name = name;

this.SSN = SSN;

email = name + "@school.com";

ID++;

System.out.println();

}

private String setUserID() {

int random = (int) (Math.random() * 8000 + 1000);

int length = SSN.length();

userID = ID + " " + random + " " + SSN.substring(length-4, length);

return userID;

}

public void enroll() {

System.out.println("Congrats " + name + "! You are enrolled!");

}

public void pay(double amount) {

balance = balance + amount;

System.out.println(name + " pays tuition fee: $" + amount);

checkBalance();

}

public void checkBalance() {

System.out.println("Balance: $" + balance);

}

@Override

public String toString() {

return "[Name: " + name + "]\n[UserID: " + setUserID() + "]\n[E-mail: " + email.toLowerCase() + "]\n[Telephone: " + getPhone() + "]\n[City: " + getCity()+ "]\n[State: " + getState() + "]";

}

public void showCourses() {

System.out.println("Courses: \n1. Electrical Engineering\n2. Sensors\n3. Electropneumatics");

}



public String getPhone() {

return phone;

}



public void setPhone(String phone) {

this.phone = phone;

}



public String getCity() {

return city;

}



public void setCity(String city) {

this.city = city;

}



public String getState() {

return state;

}



public void setState(String state) {

this.state = state;

}

}