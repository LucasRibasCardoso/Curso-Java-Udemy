package Modulo02.Vetores.ExercicioFixacao;

public class Person {

    private String name;
    private String email;
    private int room;


    public Person(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    @Override
    public String toString() {
        return room + ": " + name + ", " + email;
    }
}
