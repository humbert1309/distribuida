package Analiza;



import java.io.File;
public class Main {
    public static void main(String[] args) {
        String path ="C:\\Users\\Nadhyeli\\Documents\\NetBeansProjects\\JavaApplication40\\src\\Lexer.flex";
       
        generarLexer(path);
    }
    public static void generarLexer(String path){
        File file=new File(path);
        JFlex.Main.generate(file);
    }
}
