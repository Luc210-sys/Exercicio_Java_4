/*
Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
*/

import java.util.Scanner;

public class Peca {

    int codigo;
    double valor;
    int quant;

    public static void main(String[] args) {
        Peca pecaUm = new Peca();
        Peca pecaDois = new Peca();
        double ipi;
        double valorUm;
        double valorDois;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o código de dois dígitos da primeira peça: ");
        pecaUm.codigo = input.nextInt();
        System.out.println("Insira o valor da peça: ");
        pecaUm.valor = input.nextDouble();
        System.out.println("Informe a quantidade da peça que deseja: ");
        pecaUm.quant = input.nextInt();
        System.out.println("Insira o código de dois dígitos da segunda peça: ");
        pecaDois.codigo = input.nextInt();
        System.out.println("Insira o valor da peça: ");
        pecaDois.valor = input.nextDouble();
        System.out.println("Informe a quantidade da peça que deseja: ");
        pecaDois.quant = input.nextInt();
        System.out.println("Informe a alíquota sem o sinal de porcentagem: ");
        ipi = input.nextInt();

        valorUm = pecaUm.valor * pecaUm.quant;
        valorDois = pecaDois.valor * pecaDois.quant;

        System.out.println("O valor final a ser pago é: " + (valorUm + valorDois) * (ipi / 100 + 1));
   }
}