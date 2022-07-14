import java.util.Scanner;

<<<<<<< HEAD

=======
>>>>>>> user_name
public class HTgame {
	
	public static int Hcount;
	public static int Tcount;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Who are you?");
		String name = scanner.nextLine();
		System.out.println("Hello "+name+"!");

		System.out.println("Tossing a coin...");
		for(int i = 1;i<4;i++){
		System.out.print("Round "+ i +":");
		double coin = Math.floor(Math.random() * 2) + 1;
		
			if(coin == 1){
				System.out.println("Heads");
				Hcount++;
			}else{
				System.out.println("Tails");
				Tcount++;
			}
		}
		System.out.println("Head: "+Hcount+", Tails: "+Tcount);
		if(Hcount>Tcount)System.out.println(name+ " won!");
		else System.out.println(name+" lost");
	}
}