package ContructorAssignments;

public class Animal {
    String animalName;
    int age;
    String gender;
    int weight;

    public Animal(String animalName, int age, String gender, int weight) {
        this.animalName = animalName;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }



    public  void  behavior(){
        System.out.println(" Name of the animal is "+ animalName);
        System.out.println("age of the animal is "+ age);
        System.out.println("gender of the animal is "+ gender);
        System.out.println("weight of the animal is " + weight);
        System.out.println("make changes in foreign repo1 ");
        System.out.println("make changes in foreign repo2 ");
        System.out.println("make changes in foreign repo3 ");
        System.out.println("make changes in foreign repo4 ");
        System.out.println("make changes in foreign repo5 ");
        System.out.println("make changes in foreign repo6 ");

    }


}
