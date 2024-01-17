package src.ru.itmo.java.basics.practic9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task2 {
    public static <T> Collection <T>
    removeDuplicates(Collection<T> collection){
        return new HashSet<>(collection);
    }
}
