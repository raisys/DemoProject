

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
	printHello("IOWA-US101");
	printHello("IOWA-US102");
	printHello("IL-US501");
    }
	
	public static void printHello(String strPlace) {
        System.out.println("Hello, "+ strPlace);
    }

}
