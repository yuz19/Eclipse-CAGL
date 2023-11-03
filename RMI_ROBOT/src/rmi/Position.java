package rmi;


public class Position {
	
	int x;
	int y;
	
	public Position() {
		this.x=0;
		this.y=0;
	}
	
	public void setX(int a) {//a prend +1 ou -1
		this.x=x+a;
	}
	
	public void setY(int a) {
		this.y=y+a;
	}
	
	public void affichage() {
		System.out.print("\n");
		System.out.println("  --------------------");
		for(int j = 9; j>=0; j--) {
			System.out.print(j + "|");
			for(int i=0; i<10; i++) {
				if(this.x == i && this.y == j) System.out.print("[X]");
				else System.out.print("[ ]");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
