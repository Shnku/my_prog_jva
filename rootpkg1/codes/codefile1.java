// package rootpkg1.codes;

/**
 * codefile1
 */
public class codefile1 {

    public static void main(String[] args) {
        System.out.println("this is inside codefile: under codes");
    }
}

/*
 * 
 * codespace:/workspaces/my_prog_jva>
 * javac -d rootpkg1/classes/ *.java
 * codespace:/workspaces/my_prog_jva> cd rootpkg1/codes/
 * codespace:/workspaces/my_prog_jva/rootpkg1/codes> ls
 * codefile1.java codefile2.java
 * codespace:/workspaces/my_prog_jva/rootpkg1/codes>
 * javac -d my_prog_jva/rootpkg1/classes *.java
 * codespace:/workspaces/my_prog_jva/rootpkg1/codes> cd ..
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * javac -d classes codes/*.java
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * javac classes codes/*.java
 * error: Class names, 'classes', are only accepted if annotation processing is
 * explicitly requested
 * 1 error
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * javac classes codes/*.java
 * error: Class names, 'classes', are only accepted if annotation processing is
 * explicitly requested
 * 1 error
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * javac -d classes codes/*.java
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * set classpath=classes
 * set: Variable name 'classpath=classes' is not valid. See `help identifiers`.
 * 
 * (Type 'help set' for related documentation)
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * set classpath=/classes
 * set: Variable name 'classpath=/classes' is not valid. See `help identifiers`.
 * 
 * (Type 'help set' for related documentation)
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * set classpath= /classes
 * set: Variable name 'classpath=' is not valid. See `help identifiers`.
 * 
 * (Type 'help set' for related documentation)
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * set classpath= classes
 * set: Variable name 'classpath=' is not valid. See `help identifiers`.
 * 
 * (Type 'help set' for related documentation)
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * java -classpath classes codefile1
 * this is inside codefile: under codes
 * codespace:/workspaces/my_prog_jva/rootpkg1>
 * java -classpath classes codefile2
 * this is codefile 2:
 */
