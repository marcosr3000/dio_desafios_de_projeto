package desafio_codigo;

import java.util.*;

public class desafio_codigo3 {

    //complete o código para que ele funcione corretamente

    public static void main(String[] args) {

        //a classe Scanner auxilia na leitura dos dados de entrada
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de x1:");
        Double x1 = scan.nextDouble();
        System.out.println("Digite o valor de x1:");
        Double x2 = scan.nextDouble();
        System.out.println("Digite o valor de x1:");
        Double y1 = scan.nextDouble();
        System.out.println("Digite o valor de x1:");
        Double y2 = scan.nextDouble();

        Double resultado = Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));

        System.out.printf("A distância entre os pontos é: %.4f", resultado);




    }
}
