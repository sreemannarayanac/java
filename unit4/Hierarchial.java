class Person {
  String name;
  int age;
  boolean active;

  Person (String name, int age, boolean active) {
    this.name = name;
    this.age = age;
    this.active = active;
  }

  void display(){
    System.out.println();
    System.out.println(name);
    System.out.println(age);
    System.out.println(active);
  }
}

class Student extends Person {
  String subs[];
  String id;
  boolean hosteler;
  Student(String name, String id, int age, boolean active, String subs[], boolean hosteler) {
    super(name, age, active);
    this.subs = subs;
    this.id = id;
    this.hosteler = hosteler;
  }
  
  void display(){
    System.out.println();
    System.out.println(name);
    System.out.println(id);
    System.out.println(age);
    System.out.println(hosteler);
    System.out.println(active);
    for (int i=0; i<subs.length; i++){
      System.out.print(subs[i]+" ");
    }
    System.out.println();
  }
}

class Staff extends Person{
  String sections[];
  int id;
  Staff(String name, int id, int age, boolean active, String sections[]) {
    super(name, age, active);
    this.sections = sections;
    this.id = id;
  }
  void display(){
    System.out.println();
    System.out.println(name);
    System.out.println(age);
    System.out.println(active);
    System.out.println(id);
    for (int i=0; i<sections.length; i++){
      System.out.print(sections[i]+" ");
    }
    System.out.println();
  }
}

class Hierarchial {
  public static void main (String main[]) {
    Person p = new Person("Messi", 100, true);
    p.display();
    String subs[] = {"Psychology", "Probability"};
    Student s = new Student("Farhaan", "0300", 18, true, subs, false);
    s.display();
    String sections[] = {"A", "B"};
    Staff t = new Staff("Jassi", 1234, 35, true, sections);
    t.display();
  }
}