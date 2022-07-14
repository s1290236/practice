public class HTgame {
	public static int Hcount;
	public static int Fcount;
	public static void main(String[] args) {

		System.out.println("Tossing a coin...");
		for(int i = 1;i<4;i++){
		System.out.print("Round "+ i +":");
		double coin = Math.floor(Math.random() * 2) + 1;
		
			if(coin == 1){
				System.out.println("Heads");
				Hcount++;
			}else{
				System.out.println("Tails");
				Fcount++;
			}
		}
		System.out.println("Head: "+Hcount+", Tails: "+Fcount);
	}
}