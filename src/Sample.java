class Sample {
    int ctz0(int value) {
        if (0 <= value) {
            value--;
        }
        if (value < 0) {
            value++;
        }
        return value;
    }

    int ctz1(int value) {
        if (0 <= value) {
            value--;
        } 
        else if (value < 0) {
            value++;
        }
        return value;
    }
}
