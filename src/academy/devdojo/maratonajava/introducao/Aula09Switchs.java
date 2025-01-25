package academy.devdojo.maratonajava.introducao;

public class Aula09Switchs {
    public static void main(String[] args) {
        byte dia = 10;
        switch (dia) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thurday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Opção invalida");


        }

        char sex = 'M';
        switch (sex) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
            default:
                System.out.println("INVALIDO");
        }
    }
}
