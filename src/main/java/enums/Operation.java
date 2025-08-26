package enums;

public enum Operation {
    ADD {
        @Override
        public int add(int a, int b) {
            return a+b;
        }
    },
    ADD2{
        @Override
        public int add(int a, int b) {
            return a+2*b;
        }
    };


    public abstract int add(int a, int b);
}
