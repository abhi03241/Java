public class studenttostring {
    String name;
    int age;
    String rollnum;
    String house;

    


    // Constructor
    public studenttostring(String name, int age, String rollnum, String house) {
        this.name = name;
        this.age = age;
        this.rollnum = rollnum;
        this.house = house;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Student Details: { name: " + name + ", age: " + age + ", rollnum: " + rollnum + ", house: " + house + " }";
    }

    // main method inside the class
    public static void main(String[] args) {
        studenttostring stu = new studenttostring("Abhi", 20, "04", "Blue");
        System.out.println(stu);  // This will call toString() method
    }
}
