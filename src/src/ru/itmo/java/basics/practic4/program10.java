package src.ru.itmo.java.basics.practic4;

public class program10 {
    public static int findFirstUnique (int[] array){
        for (int i=0; i< array.length; i++){
            boolean isUnique = true;
            for (int j=0; j< array.length; j++){
                if (i !=j && array[i] == array[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                return array[i];
            }
        }
        return 0;
    }
    public static void Unigue (){
        int[] array = {1,2,3,1,2,4};
        int result = findFirstUnique(array);
        System.out.println(result);
    }
    public static void main(String[] args){
        Unigue();
    }

}
