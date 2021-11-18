public interface Test {
    int square();
}
class Arithmetic implements Test {
    int b;

    Arithmetic(int b) {
        this.b = b;
    }

    @Override
    public int square() {
        return b*b;
    }
}

    class To_TestInt{
        public static void main(String[] args) {
            Arithmetic obj = new Arithmetic(2);
            System.out.println(obj.square());
        }


    }

