
import java.util.Scanner;

// @author kezia
// Tamagochi
public class Soal1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Soal1 tamagochi = new Soal1();

        int menu = 0;
        int health = 5;

        tamagochi.nama();

        tamagochi.menu();

        while (health != 0 && menu != 5) {
           if (menu == 1) {
                tamagochi.makan();
          

            }  if (menu == 2) {
                tamagochi.mandi();
          

            }  if (menu == 3) {
                tamagochi.tidur();
              

            } if (menu == 4) {
                tamagochi.bermain();
                

            } if (menu > 5 || menu <= 0) {
                System.out.println("Makaseh bitch");
               
               break;
            }
            
            

         tamagochi.cek();
         
         
         

        }
    }
    Scanner scan = new Scanner(System.in);

    public void nama() {
        System.out.print("Siapakah Nama Pet Anda? ");
        String nama = scan.nextLine();
        System.out.println("Status " + nama + "=");
    }

    public void menu() {
        String nama = "";
        int health = 5;
        int hunger = 2;
        int mood = 2;
        int clean = 4;
        int menu = 0;
        int cek = 1;

        System.out.println("Health = " + health);
        System.out.println("Hunger = " + hunger);
        System.out.println("Mood = " + mood);
        System.out.println("Clean = " + clean);
        System.out.println("Apa yang kamu mau lakukan? ");
        System.out.println("1. Memberi " + nama + " makan");
        System.out.println("2. Memandikan " + nama);
        System.out.println("3. Menidurkan " + nama);
        System.out.println("4. Bermain " + nama);
        System.out.println("5. Exit");
        System.out.print("Pilih satu = ");
        menu = scan.nextInt();
    }

    public int makan() {
        int hunger = 2;
        hunger = hunger + 2;
        return hunger;
    }

    public int mandi() {
        int clean =4;
        int mood =2; 
        clean = 5;
        mood--;
        return clean;
    }

    public int tidur() {
        int health = 5;
        int hunger = 2;
        health++;
        hunger--;
        return health;
    }

    public int bermain() {
        int mood = 2;
        int clean = 4;
        int hunger = 2;
        mood = mood + 2;
        clean--;
        hunger = hunger - 2;
        return mood;
    }
    
    public void cek(){
        int hunger = 2;
        int health = 5;
        int mood = 2;
        int clean = 4;
        
        if (hunger < 1) {
                health = health - 1;

            } else if (clean < 1) {
                health = health - 1;

            } else if (mood < 1) {
                health = health - 1;

            } else if (health < 1) {
                health = health - 1;
            }

            if (hunger > 5) {
                health = health - 1;
            } else if (clean > 5) {
                health = health - 1;
            } else if (mood > 5) {
                health = health - 1;
            } else if (health > 5) {
                health = health - 1;
            }
    }
    
    



}
