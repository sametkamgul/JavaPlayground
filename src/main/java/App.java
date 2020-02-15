public class App {
   public static void main(String[] args) {
      System.out.println("selam dünyalı!!!");
      Person samet = new Person();
      samet.setAge(31);
      samet.setName("Samet");
      samet.setSurname("Kamgul");
      samet.setBirthdate("27.03.1989");
      samet.setBirthplace("Adana");
      samet.setNationality("Turkish");
      System.out.println("Personality details:");
      System.out.println("Name         : " + samet.getName());
      System.out.println("Surname      : " + samet.getSurname());
      System.out.println("Age          : " + samet.getAge());
      System.out.println("Birthdate    : " + samet.getBirthdate());
      System.out.println("Birthplace   : " + samet.getBirthplace());
      System.out.println("Nationality  : " + samet.getNationality());
   }
}

class Person{
   private int age = 0;
   private String name = "";
   private String surname = "";
   private String birthdate = "";
   private String birthplace = "";
   private String nationality = "";

   public int getAge() {
      return age;
   }

   public String getName()
   {
      return name;
   }

   public String getSurname() {
      return surname;
   }

   public String getBirthdate() {
      return birthdate;
   }

   public String getBirthplace() {
      return birthplace;
   }

   public String getNationality() {
      return nationality;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public void setBirthdate(String birthdate) {
      this.birthdate = birthdate;
   }

   public void setBirthplace(String birthplace) {
      this.birthplace = birthplace;
   }

   public void setNationality(String nationality) {
      this.nationality = nationality;
   }
}