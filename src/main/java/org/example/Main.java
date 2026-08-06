package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void Saludar(){
        System.out.println("Bienvenido al sistema Hernan");
    }
    public static void SaludoPersonalizado(){
        System.out.println("Hola usuario, bienvenido al sistema");
    }

    public static void Despedida(){
        System.out.println("Nos vemos luego");
    }
    public static void main(String[] args) {
        Saludar();
        SaludoPersonalizado();
        Despedida();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.




    }
}