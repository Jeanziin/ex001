package ex001;

import java.util.Scanner;

import exception.DDD_INVALIDO;


public class metodo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer ddd;

		Integer[] lista = new Integer[8];
		lista[0] = 61;
		lista[1] = 71;
		lista[2] = 11;
		lista[3] = 21;
		lista[4] = 32;
		lista[5] = 19;
		lista[6] = 27;
		lista[7] = 31;

		while (true) {
			System.out.println("Digite o DDD: ");
			ddd = sc.nextInt();

			try {
			
				if (ddd == lista[0]) {
				System.out.println("Brasilia");
				
			}else if  (ddd == lista[1]) {
				System.out.println("Salvador");
			
			}else if (ddd == lista [2]) {
				System.out.println("São paulo");
			
			}else if (ddd == lista [3]) {
				System.out.println("Rio de Janeiro");
			
			}else if (ddd == lista [4]) {
				System.out.println("Juiz de Fora");
			
			}else if (ddd == lista [5]) {
				System.out.println("Campinas");
			
			}else if (ddd == lista [6]) {
				System.out.println("Vitoria");
			
			}else if (ddd == lista [7]) {
				System.out.println("Belo Horizonte");
			
			}else {
				throw new DDD_INVALIDO ("DDD NÃO CADASTRADO, TENTE NOVAMENTE!");
			}
				
			}finally{
				
			}
		}
				
			
	}

}

