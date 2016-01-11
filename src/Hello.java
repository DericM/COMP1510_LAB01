/**
 * 
 */

/**
 * @author Deric
 * 
 * 
 * 2. Class name different from file name.
 * "Error: Could not find or load main class Hello"
 * 
 * 3. Misspelling inside string.
 * There is no error because you haven't told the program to do anything incorrect.
 * You have simply told it to print out "Helo, World" so it dose it.
 *
 * 4. No ending quotation mark in a string literal. 
 * "Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 *   String literal is not properly closed by a double-quote
 *   at Hello.main(Hello.java:26)"
 *
 * 5. No beginning quotation mark in a string literal
 * "Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
 *   Hello cannot be resolved to a variable
 *   Syntax error on token ",", delete this token
 *   Syntax error, insert ")" to complete MethodInvocation
 *   Syntax error, insert ";" to complete BlockStatements
 *   at Hello.main(Hello.java:30)"
 *   
 *  6. No semicolon after a statement. 
 *  "Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 *   Syntax error, insert ";" to complete BlockStatements
 *   at Hello.main(Hello.java:40)"
 *   
 *
 */
public class Hello {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");

    }

}
