package school.lesson3;

public class Employee {

    private String name;
    private String post;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String name, String post, String email, String phone, double salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + ", " + post + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Сердюкова Мария Анатольевна", "Ассистент", "aaa@gmail.com", "786 26 78", 1190.00,26);
        empArray[1] = new Employee("Иванов Иван Иванович", "Профессор","bbb@gmail.com", "796 16 52", 3000.00, 50);
        empArray[2] = new Employee("Петров Петр Петрович", "Доцент", "ccc@gmail.com", "536 00 23", 2500.50, 35);
        empArray[3] = new Employee("Сидоров Сидор Сидорович", "Старший преподаватель", "ddd@gmail.com", "112 06 83", 2000.00, 33);
        empArray[4] = new Employee("Шариков Александр Сергеевич", "Доцент", "eee@gmail.com", "123 45 78", 2500.50, 45);

        for (Employee emp : empArray) {
            if (emp.getAge() > 40) {
                System.out.println(emp.toString());
            }
        }
    }
}
