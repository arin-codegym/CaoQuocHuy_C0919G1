package AdvancedObjectOrientedDesign.AnimalAndInterfaceEdible;

import AdvancedObjectOrientedDesign.AnimalAndInterfaceEdible.Animal.Animal;
import AdvancedObjectOrientedDesign.AnimalAndInterfaceEdible.Animal.Chicken;
import AdvancedObjectOrientedDesign.AnimalAndInterfaceEdible.Animal.TIger;
import AdvancedObjectOrientedDesign.AnimalAndInterfaceEdible.Edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new TIger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                /*(Chicken) animal là ép kiểu tường minh;
                Edible edible = (Chicken) animal là ép kiểu ngầm định*/
                System.out.println(edible.howToEat());
            }
    }
        Animal animal1 = new Chicken()  ;
       // Chicken chicken = (Chicken)animal1;
        System.out.println(((Chicken) animal1).howToEat());;

}
}
