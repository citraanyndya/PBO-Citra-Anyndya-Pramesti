public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();
        dragon1.move(2);

        System.out.println("Status Awal Naga 1");
        dragon1.printStatus();
        System.out.println("Status Awal Naga 2");
        dragon2.printStatus();

        dragon1.changeDirection(1); 
        dragon1.move(3);

        System.out.println("STATUS NAGA 1 SAAT INI :");
        dragon1.printStatus();

        dragon2.move(4);
        dragon2.changeDirection(2);
        dragon2.move(2);

        System.out.println("STATUS NAGA 2 SAAT INI :");
        dragon2.printStatus();
    }
}

