import java.util.Scanner;

public class Programa {
	

	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);

		
		Pilha p = new Pilha();
		
		int opc;
		
		p.inicializa();
		
		do{
		
		System.out.println("1-Empilha\n2-Desempilha\n3-Mostra o topo\n4-Mostra se ta vazio\n5-Mostra se ta cheio\n6-Altera o valor do topo:\n7-Sair\n");
		opc=tc.nextInt();
		
		switch(opc){
		
		case 1: {
			int v;
			System.out.println("Informe um valor");
			v=tc.nextInt();
			p.push(v);
			break;
		}
		
		case 2:{
			p.pop();
			break;
		}
		case 3:{
			p.top();
			break;
		}
		case 4:{
			p.isEmpety();
			break;
		}
		case 5:{
			p.isFull();
			break;
		}
		
		case 6:{
			int v;
			System.out.println("Informe o valor para alterar do topo:");
			v=tc.nextInt();
			p.pull(v);
		}
		
		}
		
		}while(opc!=7);	
	}

}
