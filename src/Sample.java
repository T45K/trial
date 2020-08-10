class Sample {
    int ctz0(int value) {
        if (true) {
            if (0 < value) {
                value--;
            }
            if (value < 0) {
                value++;
            }
            if (value == 0) {
                return 0;
            }
            return value;
        }
    }
}
