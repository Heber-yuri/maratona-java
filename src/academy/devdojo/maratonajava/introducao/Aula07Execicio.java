package academy.devdojo.maratonajava.introducao;

public class Aula07Execicio {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorDoImposto;
        if(annualSalary <= 34712){
            valorDoImposto = annualSalary * primeiraFaixa;
        } else if (annualSalary >= 34712 && annualSalary <= 68507){
            valorDoImposto = annualSalary * segundaFaixa;
        }else{
            valorDoImposto = annualSalary * terceiraFaixa;
        }
        System.out.println(valorDoImposto);
    }
}
