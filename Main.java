import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) throws  RuntimeException {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        try {
            if (str.isEmpty()) {

                throw new EmptyString_Exception("Genarate exception  "+str);
            }else {
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

