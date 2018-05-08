package competitors;

public class Human implements Competitor{

    String type = "Человек";;
    String name;
    int maxRinDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean active;

    public Human(String name) {
        this.name = name;
        this.maxRinDistance = 5000;
        this.maxJumpHeight = 20;
        this.maxSwimDistance = 500;
        this.active = true;
    }

    public boolean isOnDistance() {
        return active;
    }

    public void run(int distance) {
        if(distance  <= maxRinDistance) {
            System.out.println(type + " " + name + " успешно пробехал кросс!");
        } else {System.out.println(type + " " + name + " не смог преодолеть кросс!");
            active = false;
        }
    }

    public void jump(int height) {
        if(height  <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно перепрыгнул препятствие!");
        } else {System.out.println(type + " " + name + " не смог перепрыгнуть препятствие!");
            active = false;
            return;
        }
    }

    public void swim(int distance) {
        if(maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать!");
            active = false;
        }

        if(distance  <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно переплыл!");
        } else {System.out.println(type + " " + name + " не смог переплыть!");
            active = false;
        }
    }

    public void showResult() {
        System.out.println(type + " " + name + ": " + active);
    }

    public void showName() {
        System.out.println(type + " " + name);
    }


}
