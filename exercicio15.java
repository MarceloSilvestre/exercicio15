import java.util.Scanner;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//a: salário bruto.
//b: quanto pagou ao INSS.
//c: quanto pagou ao sindicato.
//d: o salário líquido.
//e: calcule os descontos e o salário líquido, conforme a tabela abaixo:

public class exercicio15 {
    public static void main(String[] args) {
        //variaveis
        double ganhoporhora, horastrabalhadas,salariobruto,impostoderenda,inss,sindicato,salarioliquido;

        Scanner teclado = new Scanner(System.in);

        //entrada
        System.out.println("quanto você ganha por hora ");
        ganhoporhora = teclado.nextDouble();
        System.out.println("quantas horas você trabalhou no mês ");
        horastrabalhadas = teclado.nextDouble();
        teclado.close();

        //calculo de dados
        salariobruto = ganhoporhora * horastrabalhadas;

        impostoderenda = salariobruto *0.11;
        inss = salariobruto * 0.08;
        sindicato = salariobruto * 0.05;

        salarioliquido = salariobruto - impostoderenda - inss - sindicato;

        //mostrando informações
        System.out.println("seu salário bruto é R$ " + salariobruto);
        System.out.println("");
        System.out.println("valor gasto com imposto de renda R$ " + impostoderenda);
        System.out.println("");
        System.out.println("valor gasto com inss R$ " + inss);
        System.out.println("");
        System.out.println("valor gasto com sindicato R$ " + sindicato);
        System.out.println("");
        System.out.println("salario líquido R$ " + salarioliquido);

        
    }
}
