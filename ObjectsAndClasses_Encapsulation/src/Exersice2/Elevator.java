package Exersice2;

public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;
    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveDown() {
        currentFloor -= 1;
    }
    public void moveUp() {
        currentFloor += 1;
    }
    public void move(int floor) {
        int i = currentFloor;
        if (floor < minFloor || floor > maxFloor){
            System.out.println("Ошибка. Такого этажа в этом здании нет.");
        }
        else if (floor < currentFloor) {
            for (; i > floor; i--) {
                moveDown();
                System.out.println(currentFloor);
            }
        }else if (floor == currentFloor) {
            System.out.println("");
        }else {
            for (; i < floor; i++) {
                moveUp();
                System.out.println(currentFloor);
            }
        }
    }
}
