import java.util.Scanner;

abstract class AbstractClass{
    final void tempLateMethod(){

    }

    abstract void primitiveOperation1();
    abstract void primitiveOperation2();

    final void concreteOperation(){

    }
    void hook(){

    }
}

abstract class CaffeinBeverage3{
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondimenrs()){
            addCondiments();
        }
    }

    boolean customerWantsCondimenrs(){
        return true;
    }

    protected abstract void addCondiments();

    void pourInCup(){
        System.out.println("倒进杯子");
    }

    protected abstract void brew();

    void boilWater(){
        System.out.println("煮沸水");
    }
}

class Tea3 extends CaffeinBeverage3{

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    protected void brew() {
        System.out.println("茶");
    }
}

class Coffee3 extends CaffeinBeverage3{

    @Override
    protected void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("咖啡");
    }

    public boolean customerWantsCondimenrs(){
        String answer = getUserInput();
        if(answer.equals("y")){
            return true;
        }
        return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("您需要加糖吗（y/n）?");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        return answer;
    }
}
public class Practice3 {
    public static void main(String[] args) {
        CaffeinBeverage3 tea = new Tea3();
        CaffeinBeverage3 coffee = new Coffee3();

        System.out.println("tea");
        tea.prepareRecipe();

        System.out.println("coffee");
        coffee.prepareRecipe();
    }
}
