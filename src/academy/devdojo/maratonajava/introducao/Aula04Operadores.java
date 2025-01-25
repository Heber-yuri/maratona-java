package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;
        System.out.println(result);
        int resto = 21 % 7;
        System.out.println(resto);

        boolean IsDezMaiorQueVinte = 10 > 20;
        boolean IsDezMenorQueVinte = 10 < 20;
        boolean IsDezIgualQueVinte = 10 == 20;
        boolean IsDezIgualDez = 10 == 20;


        System.out.println("IsdezMaiorQueVinte " + IsDezMaiorQueVinte);
        System.out.println("IsdezMenorQueVinte " + IsDezMenorQueVinte);
        System.out.println("IsdezigualQueVinte " + IsDezIgualQueVinte);
        System.out.println("IsDezIgualDez " + IsDezIgualDez);

        int age = 35;
        float wage = 3500F;
        boolean IsDentroDaLeiMaiorQueTrinta = age > 30 && age >= 4612;
        boolean IsDentroDaLeiMenorQueTrinta = age < 30 && age > 3381;

        System.out.println("IsDentroDaLeiMaiorQueTrinta " + IsDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta " + IsDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

    }
}
