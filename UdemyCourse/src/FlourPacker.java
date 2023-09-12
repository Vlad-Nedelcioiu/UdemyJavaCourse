public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (goal == bigCount * 5 + smallCount) {
            return true;
        } else if (goal > bigCount * 5 + smallCount) {
            return false;
        } else {
            if (smallCount > goal) {
                return true;
            } else if (((Math.abs(goal - (bigCount * 5)) % goal) - smallCount) <= 0) {
                return true;
            } else
                return false;
        }
    }
}
