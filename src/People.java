public class People {

    private int age;
    private String name;

    private static int id = 0;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    {
        age = 18;
        name = "Some name";
        System.out.println("Я родился");
        id +=1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=18){
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")){
            this.name = name;
        }
    }
    public void info() {
        System.out.println(id +") Меня зовут " + name + ", мне " + age + " лет");

    }
}
