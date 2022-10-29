/**
 * @author holten
 * @date 2021/3/10
 */
class Q1603_DesignParkingSystem {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }

    static class ParkingSystem {
        int big;
        int medium;
        int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if (carType == 3) {
                if (small <= 0) {
                    return false;
                } else {
                    small--;
                    return true;
                }
            } else if (carType == 2) {
                if (medium <= 0) {
                    return false;
                } else {
                    medium--;
                    return true;
                }
            } else if (carType == 1) {
                if (big <= 0) {
                    return false;
                } else {
                    big--;
                    return true;
                }
            }
            return false;
        }
    }
}