class gettersandsetters {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    int b;

    boolean compare(gettersandsetters ob) {
        return this.a == ob.a;
    }
}

public class GFG {
    public static void main(String[] args) {
        gettersandsetters ob1 = new gettersandsetters();
        ob1.setA(23);
        gettersandsetters ob2 = new gettersandsetters();
        ob2.setA(23);
        gettersandsetters ob3 = new gettersandsetters();
        ob3.setA(40);
        System.out.println(ob1.compare(ob2));
        System.out.println(ob1.compare(ob3));
    }
}