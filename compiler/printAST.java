package compiler;
import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import parser.miniJavaLexer;
import parser.miniJavaParser;
//public class printAST 
//{
//    public static void main( String[] args) throws Exception 
//    {
//
//        ANTLRInputStream input = new ANTLRInputStream( System.in);
//
//        miniJavaLexer lexer = new miniJavaLexer(input);
//
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//        miniJavaParser parser = new miniJavaParser(tokens);
//        ParseTree tree = parser.r(); // begin parsing at rule 'r'
//        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
//    }
//}


public class printAST {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("example.Java"); // or System.in;
        ANTLRInputStream input = new ANTLRInputStream(is);
        miniJavaLexer lexer = new miniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniJavaParser parser = new miniJavaParser(tokens);
        ParseTree tree = parser.goal(); // calc is the starting rule

        System.out.println("LISP:");
        System.out.println(tree.toStringTree(parser));
        
    }
}