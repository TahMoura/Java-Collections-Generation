package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ElementosInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> nums = new HashSet<>();

        System.out.println("Adicionando elementos inteiros em uma Collection Set e mostrando-os"
                + "\n***************************************************************************");

        for(int i = 1; i <= 10; i++) {
            System.out.print("Por favor, digite o " + i + "º número: ");
            int num = scan.nextInt();
            nums.add(num);
        }

        System.out.println("\n***************************************************************************\nListando os elementos digitados...");
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

