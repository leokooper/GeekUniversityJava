package competitors;

public class Animal implements Competitor{

    String type;
    String name;
    int maxRinDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public Animal(String type, String name, int maxRinDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRinDistance = maxRinDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void run(int distance) {
        if(distance  <= maxRinDistance) {
            System.out.println(type + " " + name + " успешно пробежал кросс!");
        } else {System.out.println(type + " " + name + " не смог преодолеть кросс!");
        onDistance = false;
        }
    }

    public void jump(int height) {
        if(height  <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно перепрыгнул препятствие!");
        } else {System.out.println(type + " " + name + " не смог перепрыгнуть препятствие!");
            onDistance = false;
            return;
        }
    }

    public void swim(int distance) {
        if(maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать!");
            onDistance = false;
            return;
        }

        if(distance  <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно переплыл!");
        } else {System.out.println(type + " " + name + " не смог переплыть!");
            onDistance = false;
        }
    }

    public void showResult() {
        System.out.println(type + " " + name + ": " + onDistance);
    }

    public void showName() {
        System.out.println(type + " " + name);
    }



}
