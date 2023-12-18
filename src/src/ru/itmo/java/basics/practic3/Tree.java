package src.ru.itmo.java.basics.practic3;

public class Tree {
    private int age;
    private boolean alive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
        this.alive = true;
    }

    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.name = name;
        this.alive = alive;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree(10, "Oak");
        Tree tree2 = new Tree(15, true, "Pine");
        Tree tree3 = new Tree();
    }
}
