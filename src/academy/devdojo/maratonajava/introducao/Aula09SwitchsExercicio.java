package academy.devdojo.maratonajava.introducao;

public class Aula09SwitchsExercicio {
    public static void main(String[] args) {
        byte day = 7;
        switch (day) {
            case 1:
            case 7:
                System.out.println("FInal Week");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Bunisses Day");
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }
}
