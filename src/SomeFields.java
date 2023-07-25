public class SomeFields {
    public static void main(String[] args) {
        //Create a small program that defines some fields.
        // Try creating some illegal field names and see what kind of error the compiler produces.
        // Use the naming rules and conventions as a guide. In the program you created, try leaving the fields uninitialized and print out their values.
        // Try the same with a local variable and see what kind of compiler errors you can produce.
        // Becoming familiar with common compiler errors will make it easier to recognize bugs in your code.


        int 123illegalField = 5;  // Starts with a number
        int illegalField@ = 8;    // Contains special characters
        int for = 3;              // 'for' is a Java keyword

        int uninitializedLocalVar;
        String uninitializedString;


       System.out.println("Uninitialized Local Variable: " + uninitializedLocalVar);
        System.out.println("Uninitialized String: " + uninitializedString);
    }
}
