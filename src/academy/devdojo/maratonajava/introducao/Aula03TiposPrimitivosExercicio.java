package academy.devdojo.maratonajava.introducao;
/* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.

 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Heber";
        String address = "Rua Das Minas N6";
        double wage = 2000;
        String dataRecebimeno = "11/01/2025";
        String relatorio = " Eu "+name+" morando no endereço"+address+", confirmo que recebi o salário de"+wage+", na data"+dataRecebimeno;
        System.out.println(relatorio);
    }
}