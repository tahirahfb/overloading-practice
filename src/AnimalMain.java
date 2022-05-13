import java.util.*;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner addAnimals = new Scanner(System.in);
        Scanner isItADog = new Scanner(System.in);
        boolean dog;
        ArrayList<Animal> listOfAnimals = new ArrayList<>();

        listOfAnimals.add(new Animal("Charlie"));
        listOfAnimals.add(new Animal(true));
        listOfAnimals.add(new Animal("Clifford", true));

        System.out.println("Animal Menu:");
        System.out.println("Entering nothing will stop the list!");

        while(true) {
            System.out.println("Please enter the animal's name: ");
            String name = addAnimals.nextLine();

            if(name.isBlank()){
                break;
            }

            System.out.println("Is it a dog? Yes or No: ");
            String dogIn = isItADog.nextLine();

    

            if(dogIn.equalsIgnoreCase("yes")){
                dog = true;
            } else {
                dog = false; 
            }


            listOfAnimals.add(new Animal(name, dog));
        }

        for (Animal ani : listOfAnimals){
            System.out.println(ani.toString());
            // System.out.println(a.getName());
        }
addAnimals.close();
isItADog.close();

    }
}
