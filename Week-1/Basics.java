class Basics {
	
	public static void main (String args[]){
	    System.out.println("Hello");
	    System.out.print("HelloWorld");
	    System.out.println("Helloworld");

	}
}  

/*
     * =========================================================================
     * EASY THEORY TO GET STARTED WITH JAVA
     * =========================================================================
     *
     * 1. WHAT IS JAVA?
     *    - Java is a popular, high-level, object-oriented programming language.
     *    - Famous motto: "WORA" -> Write Once, Run Anywhere.
     *    - How WORA works: You write code (.java) -> compile it into
     *      platform-independent bytecode (.class) -> run it on any OS that
     *      has a JVM (Windows, Mac, Linux).
     *
     * 2. JDK, JRE, AND JVM (From Largest to Smallest)
     *    Think of them as nested boxes:
     *    +---------------------------------------------------+
     *    | JDK (Java Development Kit)                        |
     *    |  +---------------------------------------------+  |
     *    |  | JRE (Java Runtime Environment)              |  |
     *    |  |  +---------------------------------------+  |  |
     *    |  |  | JVM (Java Virtual Machine)            |  |  |
     *    |  |  +---------------------------------------+  |  |
     *    |  +---------------------------------------------+  |
     *    +---------------------------------------------------+
     *
     *    - JVM (Java Virtual Machine):
     *      * The engine that actually runs your compiled Java bytecode (.class).
     *      * It is platform-dependent (there is a Windows JVM, Mac JVM, etc.),
     *        which makes Java itself platform-independent.
     *      * Also handles memory management and Garbage Collection.
     *
     *    - JRE (Java Runtime Environment):
     *      * Contains JVM + core Java libraries/classes needed to RUN a Java
     *        program (for example, java.lang, java.util like Scanner).
     *      * Enough if you only want to run existing Java apps, not write/compile
     *        new code.
     *
     *    - JDK (Java Development Kit):
     *      * Contains JRE + development tools needed to WRITE, COMPILE, and
     *        DEBUG Java programs.
     *      * Includes tools like 'javac' (the Java compiler) and 'java'
     *        (the launcher). You install the JDK to learn and build Java code.
     *
     * 3. WHAT IS: public static void main(String[] args) ?
     *    This line is the ENTRY POINT (starting line) of a standalone Java
     *    program. When you run a class, the JVM looks for this exact signature:
     *
     *    - public   : Access modifier meaning anyone (including the JVM from
     *                 outside the class) can call this method.
     *    - static   : Means the method belongs to the class itself, not to a
     *                 specific object. The JVM can call main() directly without
     *                 creating an object of the class first.
     *    - void     : Return type meaning main() does NOT send any value back
     *                 to the JVM when it finishes.
     *    - main     : The special method name the JVM searches for to start
     *                 execution.
     *    - String[] args (or String args[]):
     *                 An array of Strings that can receive command-line
     *                 arguments passed when running the program from terminal.
     *
     * 4. OTHER QUICK BEGINNER BASICS
     *    - Class: A blueprint/container in Java. Every Java program starts with
     *      a class (e.g., class HelloWorld). File name should match the public
     *      class name (HelloWorld.java).
     *    - Semicolon (;): Ends almost every statement in Java.
     *    - System.out.println(...): Prints text to the screen and moves to a
     *      new line. (System.out.print(...) stays on the same line.)
     *    - Comments: Notes ignored by the compiler for humans to read.
     *      * // single-line comment
     *      * /* multi-line comment * /
     *
     * 5. HOW TO COMPILE AND RUN IN TERMINAL
     *    Step 1 (Compile): javac Basics.java  -> creates .class file
     *    Step 2 (Run):     java Basics        -> runs bytecode in JVM
     * =========================================================================
     */
