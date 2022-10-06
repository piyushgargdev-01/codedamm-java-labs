import java.util.ArrayList;
import java.util.List;

class Person {

  private String fullName;

  Person(String fullName) {
    this.fullName = fullName;
  }

  public String getFullName() {
    return this.fullName;
  }

  public void setFullName(String name) {
    this.fullName = name;
  }
}

class Student extends Person {

  private int rollNumber;
  private List<Student> friends;

  static int numberOfStudents = 0;

  Student(String fullname, int rollNumber) {
    super(fullname);
    this.friends = new ArrayList<>();
    this.rollNumber = rollNumber;
    numberOfStudents++;
  }

  public int getRollNumber() {
    return this.rollNumber;
  }

  public void setRollNumber(int newRoll) {
    this.rollNumber = newRoll;
  }

  public List<Student> getFriends() {
    return this.friends;
  }

  public void addFriend(Student student) {
    this.friends.add(student);
    student.friends.add(this);
  }

  public void removeFriend(Student student) {
    this.friends.remove(student);
    student.friends.remove(this);
  }

  public boolean isFriendOf(Student student) {
    return this.friends.contains(student);
  }

  public int getRollNo(Student student) throws IllegalAccessException {
    if (
      this.friends.contains(student)
    ) return student.rollNumber; else throw new IllegalAccessException(
      "You are not friend of " + student.getFullName()
    );
  }

  public void removeAllFriends() {
    for (Student friend : this.friends) {
      friend.friends.remove(this);
      this.friends.remove(friend);
    }
  }

  public String toString() {
    return this.getFullName();
  }
}

public class Main {

  public static void main(String args[]) {
    Student piyush = new Student("Piyush", 1);
    Student jhon = new Student("Jhon", 2);
    Student jane = new Student("Jane", 3);
    Student parry = new Student("Parry", 4);

    piyush.addFriend(jhon);
    piyush.addFriend(jane);

    try {
      System.out.println(piyush.getRollNo(jane));
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
