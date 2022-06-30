package Plakatowanie;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> height = new LinkedList<Integer>();
		
		int n = scanner.nextInt();
		int posters = 0;
		
		if(n < 1 || n > 250000)
		{
			System.out.println("n must be >= 1 and <= 250 000");
		}
		else
		{
			posters = 0;
			for(int i = 0; i < n; i++)
			{
				int di = scanner.nextInt();
				int wi = scanner.nextInt();
				
				if(di < 1 || wi > 1000000000)
				{
					System.out.println("di must be >= 1 or wi must be <= 1 000 000 000");
				}
				else
				{
					while(!height.isEmpty() && height.get(height.size()-1) > wi)
					{
						height.remove(height.size()-1);
					}
					if(height.isEmpty() || height.get(height.size()-1) < wi)
					{
						height.add(wi);
						posters++;
					}
				}
			}
			System.out.println(posters);
		}

	}

}
