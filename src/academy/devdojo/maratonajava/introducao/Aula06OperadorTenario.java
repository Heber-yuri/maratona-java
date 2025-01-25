package academy.devdojo.maratonajava.introducao;

public class Aula06OperadorTenario {
    public static void main(String[] args) {
        double wage = 5000;
        String mensagemDoar = "Eu vou doar 500tao para o Dev Dojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter";
        String resultado = wage > 6000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
