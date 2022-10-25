import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        double petMystic, petBattle, clonePhysical, cloneMystic, cloneBattle;
        System.out.println("Este algoritmo calcula os atributos ideais para ganho máximo de XP com seu Pet");

        for (int i = 1; i > 0; i++){

                System.out.println("Insira o valor \"Mystic\" de seu Pet: ");
                petMystic = ler.nextDouble();
                clonePhysical = petMystic * 23 / 11000;
                cloneMystic = petMystic * 5 / 9;
                cloneBattle = petMystic * 1.1 / 2;
                System.out.println("Estes são ideais para o clone para maximizar o ganho de XP:");
                System.out.println("Physical: " + clonePhysical);
                System.out.println("Mystic: " + cloneMystic);
                System.out.println("Battle: " + cloneBattle);
            }
            }

        }

