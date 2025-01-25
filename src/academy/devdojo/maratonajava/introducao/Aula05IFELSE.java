package academy.devdojo.maratonajava.introducao;

public class Aula05IFELSE {
    public static void main(String[] args) {
        int age = 20;
        if(age < 15){
            System.out.println("Categoria Infantil");
        }else if(age >=15 && age <18){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }
        }
}
