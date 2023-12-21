import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);

        Random random = new Random(); //random sınıfı tanımlandı. 0 ve 1 değerleri gelecek.
        int a = random.nextInt(2);

        if (a==0){ //0 gelirse marc önde oldu.
            Ring r = new Ring(marc, alex, 90, 100);
            r.run();
        }
        else{ //1 gelirse Alex önde oldu.
            Ring r = new Ring(alex, marc, 90, 100);
            r.run();
        }


    }
}