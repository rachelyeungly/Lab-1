class Multiples {
    public static int main(int limit, int a, int b) {
        int count = 0;

        for (int i = 1; i < limit; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }
    public static int main() {
        return main(1000,3,5);
    }
}
