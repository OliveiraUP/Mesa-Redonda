package br.com.PF.solucao;

import java.util.Scanner;
//Solução para o problema Mesa Redonda
public class solucao {
	
	public static void main(String[] args) {
		//Invocando a classe Scanner para poder receber os dados.
		Scanner leitor = new Scanner(System.in);
		//Declarando as variáveis que serão usadas para a resolução do problema
		int i,contA=0,contB=0,cadeiraCarolina=0;
		//Recebendo os números sorteados de Ana e Beatriz
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		//Implementando o contador de Ana que será usado para verificar em qual cadeira terminará a contagem, 
		//começando de 0 até 3, quando se chega em 3 o contador reseta e volta a ser 0.
		for(i=0;i<A;i++){
			contA++;
			if(contA==3){
				contA=0;
			}
		}
		//Implementando o mesmo contador com a mesma lógica usada acima, agora para Beatriz.
		for(i=0;i<B;i++){
			contB++;
			if(contB==3){
				contB=0;
			}
		}
		//Comparando se a cadeira de Beatriz é a mesma de Ana, se sim o contador implementa +1,
		//e se for igual a 3 ele reseta e volta pro 0.
		if(contB==contA){
			contB++;
			if(contB==3){
				contB=0;
			}
		}
		//Verificando qual cadeira ainda está disponível para Carolina usar.
		if((contA==0 && contB==1) || (contA==1 && contB==0)){
		    cadeiraCarolina=2;
		}else if((contA==0 && contB==2)||(contA==2 && contB==0)){
		    cadeiraCarolina=1;
		}else if((contA==1 && contB==2)|| (contA==2 && contB==1)){
		    cadeiraCarolina=0;
		}
		//Printando a cadeira disponível para Carolina.
		System.out.printf("%d",cadeiraCarolina);
	}
}


