package src.ru.itmo.java.basics.practic6;

public class main{
    public static void main (String[] args){
        human client = new client("Артём", "Иванов","Тинькофф");
        human bankEmployee = new bankEmployee("Элина", "Радионова","Сбербанк");

        client.print();
        bankEmployee.print();

    }

}

abstract class human{
    private String name;
    private String surname;
    public human(String name, String surname){
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
class client extends human{
    private String nameBank;
    public client (String name, String surname, String nameBank){
    super(name, surname);
    this.nameBank = nameBank;
    }

    @Override
    public void print() {
        System.out.println("Name:" + getName() + " Surname:" + getSurname() + " Bank:" + nameBank);
    }
}
class bankEmployee extends human{
    private String nameBank;
    public bankEmployee(String name, String surname, String nameBank){
        super(name, surname);
        this.nameBank = nameBank;
    }

    @Override
    public void print() {
        System.out.println("Name:" + getName() + " Surname:" + getSurname() + " Name Bank:" + nameBank);
    }
}



