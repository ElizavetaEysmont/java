package src.ru.itmo.java.basics.practic6;

public class main{
    public static void main (String[] args){
        Human client = new Client("Артём", "Иванов","Тинькофф");
        Human bankEmployee = new BankEmployee("Элина", "Радионова","Сбербанк");

        client.print();
        bankEmployee.print();

    }

}

abstract class Human{
    private String name;
    private String surname;
    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public abstract void print();
}
class Client extends Human{
    private String nameBank;
    public Client (String name, String surname, String nameBank){
    super(name, surname);
    this.nameBank = nameBank;
    }

    @Override
    public void print() {
        System.out.println("Name:" + getName() + " Surname:" + getSurname() + " Bank:" + nameBank);
    }
}
class BankEmployee extends Human{
    private String nameBank;
    public BankEmployee(String name, String surname, String nameBank){
        super(name, surname);
        this.nameBank = nameBank;
    }

    @Override
    public void print() {
        System.out.println("Name:" + getName() + " Surname:" + getSurname() + " Name Bank:" + nameBank);
    }
}



