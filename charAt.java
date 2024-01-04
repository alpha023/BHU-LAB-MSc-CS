import java.lang.reflect.Field;

public class charAt {
    // final byte[] value

    public static void main(String[] args) {

        
        // String original="hello";
        // //this.value=original.value;
        // System.out.println("");

        String str="Abba";
        final Field value=String.class.getDeclaredField("value");
        value.setAccessible(true);

    }
}
