public class Dragon {
    int x;
    int y;
    int direction;

    Dragon() {
        x = 0;
        y = 0;
        direction = 0; 
    }

    public void changeDirection(int newDirection) {
        if (newDirection > 0 && newDirection < 5) {
            direction = newDirection;
        }
    }

    public void move(int steps) {
        if (direction < 1 || direction > 4) {
            System.out.println("Arah belum ditentukan, silahkan panggil changeDirection() terlebih dahulu");
            return;
        }

        if (direction == 1) {
            y += steps;
        } else if (direction == 2) {
            x += steps;
        } else if (direction == 3) {
            y -= steps;
        } else if (direction == 4) {
            x -= steps;
        }
    }

    public void printStatus() {
        System.out.println("Posisi (x, y): (" + x + ", " + y + ")");
        System.out.println("Arah saat ini adalah : " + (direction == 0 ? "Belum diatur" :  direction));
    } 
}
