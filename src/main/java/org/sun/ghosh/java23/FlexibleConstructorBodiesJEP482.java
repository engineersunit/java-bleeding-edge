class Super {
    Super() {
        overriddenMethod();
    }

    void overriddenMethod() {
        print("Java 23");
    }
}

class Sub extends Super {
    final int sub;

    Sub(int sub) {
        this.sub = sub;
        super();
    }

    @Override
    void overriddenMethod() {
        print(sub);
    }
}

void main() {
    new Sub(23);
}
