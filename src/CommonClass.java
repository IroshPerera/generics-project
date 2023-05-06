public class CommonClass<T> {
    T b;

    CommonClass(T b) {

        this.b = b;
    }

    void setWrapper(T b) {
        this.b = b;
    }

    T getWrapper() {
        return b;
    }

    void print() {
        System.out.println(b);
    }
}
