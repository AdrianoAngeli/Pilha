
public class Pilha {
	
	int [] p = new int[10];
	
	int topo;
	
	public void inicializa(){
		this.topo=-1;
	}
	
	public boolean push(int v){
		if(topo>9){
			System.out.println("Pilha cheia");
			return false;
		}else{
		topo++;
		p[topo]=v;
		return true;
		}
	}
	
	public boolean pull(int v){
		if(isEmpety()){
			//System.out.println("A pilha esta vazia");
			return false;
		}
		else{
			p[topo]=v;
			return true;
		}
	}
	
	public boolean pop(){
		if(topo==-1){
			System.out.println("A pilha já esta vazia!");
			return false;
		}
		else{
			topo--;
			return true;
		}
	}
	
	public boolean top(){
		if(topo<0){
			return false;
		}
		else{		
			System.out.println(p[topo]);
			return true;
		}
	}
	
	public boolean isEmpety(){
		if(topo<0){
			System.out.println("Pilha vazia");
			return true;
		}
		else{
			System.out.println("Pilha não esta vazia");
			return false;
		}
	}
	
	public boolean isFull(){
		if(topo>9){
			System.out.println("Pilha cheia:");
			return true;
		}
		else{
			System.out.println("Pilha não cheia:");
			return false;
		}
	}

}
