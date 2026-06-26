package PolymorphismDemo;


    // Superclase (Clase Padre)
class Animal {
    // Método que será anulado/sobreescrito
    public void makeSound() {
        System.out.println("El animal hace un sonido genérico");
    }
}

// Subclase 1 (Clase Hija)
class Dog extends Animal {
    // Se usa la anotación @Override para buena práctica y validación del compilador
    @Override
    public void makeSound() {
        System.out.println("El perro hace: ¡Guau! ¡Guau!");
    }
}

// Subclase 2 (Clase Hija)
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("El gato hace: ¡Miau!");
    }
}
   

// Clase Principal para ejecutar el código
public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Crear instancias utilizando Polimorfismo
        Animal miAnimal = new Animal();
        Animal miPerro = new Dog();
        Animal miGato = new Cat();

        // Ejecutar los métodos
        miAnimal.makeSound(); // Imprime: El animal hace un sonido genérico
        miPerro.makeSound();  // Imprime: El perro hace: ¡Guau! ¡Guau!
        miGato.makeSound();   // Imprime: El gato hace: ¡Miau!
    }
}
