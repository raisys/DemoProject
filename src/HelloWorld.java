

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
	printHello("IOWA-US101");
	printHello("IL-US501");
	printHello("IL-US502");
    }
	
	public static void printHello(String strPlace) {
        System.out.println("Hello, "+ strPlace);
    }

}
