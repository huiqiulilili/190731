abstract class A{
    public abstract void printA();
    abstract static class B{
        public abstract void printB();
    }
}
class X extends A{

    @Override
    public void printA() {

    }
    class Y extends B{

        @Override
        public void printB() {

        }
    }
}
public class Practice {
}
