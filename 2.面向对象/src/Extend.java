class Mankind {
  int sex;
  int salary;

  Mankind(int age) {

  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public void manOrWoman() {
    System.out.println(sex == 1 ? "man" : "woman");
    this.employed();
  }

  public Object employed() {
    System.out.println(salary == 0 ? "no job" : "job");
    return null;
  }
}

class Kids extends Mankind {
  private int yearsOld;
  int sex = 10;

  Kids() {
    super(10);
  }

  Kids(int yearsOld) {
    super(10);
    this.yearsOld = yearsOld;
  }

  public void printAge() {
    // System.out.println(this.yearsOld);
    System.out.println(super.sex);
  }

  public String employed() {
    System.out.println("employasdfed");
    return "";
  }
}

class KidsTest {
  public static void main(String[] args) {
    Kids kid = new Kids(22);
    // kid.printAge();
    kid.printAge();
    kid.setSalary(1000);
    kid.setSex(1);

    // kid.manOrWoman();
    // kid.employed();
  }
}