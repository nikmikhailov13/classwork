package gmail.nikmikhailov13.lesson16.animals;

public class Cat {

  public static final boolean HAS_TAIL = true;
  private String name;
  private int age;
  private double weight;
  private Breed breed;

  public Cat() {
  }

  public Cat(String name, int age, double weight, Breed breed) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.breed = breed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public Breed getBreed() {
    return breed;
  }

  public void setBreed(Breed breed) {
    this.breed = breed;
  }

  public String voice() {
    return "Miau";
  }

  @Override
  public String toString() {
    return "Cat{" +
        "name='" + name +
        ", age=" + age +
        ", weight=" + weight +
        ", breed=" + breed +
        '}';
  }

}
