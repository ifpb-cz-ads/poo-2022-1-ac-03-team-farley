import java.util.Scanner;

public class quest1CT{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int idade;
		System.out.print("Idade: ");
		idade = scan.nextInt();
		scan.close();
		if(idade<16){
			System.out.print("Não pode votar");
		}else if((idade>=18)&& (idade<=65)){
			System.out.print("\nVoto obrigatorio.\n");
		}else{
			System.out.print("Voto facultativo\n");
		}
	}

}