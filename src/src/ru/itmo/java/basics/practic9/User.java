package src.ru.itmo.java.basics.practic9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String name;
    public User(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class Program {
    public static void main (String[] args){
        Map<User, Integer> userPoints = new HashMap<>();
        userPoints.put(new User("Маша"), 30);
        userPoints.put(new User("Лиза"), 90);
        userPoints.put(new User("Егор"), 150);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String userName = scanner.nextLine();
        User userToFind = new User(userName);
        for (Map.Entry<User, Integer> entry:userPoints.entrySet()) {
            User user = entry.getKey();
            if (user.getName().equals(userToFind.getName())) {
                int points = entry.getValue();
                System.out.println("Пользователь " + userName + " имеет " + points + " баллов");
                return;
            }
        }
                System.out.println("Пользователь " +userName+ " не найден.");
            }
        }



