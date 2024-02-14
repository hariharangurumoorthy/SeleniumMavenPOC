import java.util.Arrays;
import java.util.List;

public class ArrayHandsOn {

    public void testArray(){
        String a[] = {"testC","testA","testB"};

        for(int i=0;i< a.length;i++){
            a[i]="j";
        }

        for(String b:a){
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        ArrayHandsOn aho = new ArrayHandsOn();
        aho.testArray();
    }
}
