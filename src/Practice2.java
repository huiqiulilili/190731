//class Coffee{
//    void prepareRecipe(){
//        boilWater();
//        breCoffeeGrings();
//        pourInCup();
//        addSugarAndMilk();
//    }
//
//    private void addSugarAndMilk() {
//        System.out.println("放糖和牛奶");
//    }
//
//    private void pourInCup() {
//        System.out.println("把咖啡放进杯子里");
//    }
//
//    private void breCoffeeGrings() {
//        System.out.println("冲咖啡");
//    }
//
//    private void boilWater() {
//        System.out.println("将水煮沸");
//    }
//}
//
//class Tea{
//    void prepareRecipe(){
//        boilWater();
//        steepTeaBag();
//        pourInCup();
//        addLemon();
//    }
//
//    private void addLemon() {
//        System.out.println("加柠檬");
//    }
//
//    private void pourInCup() {
//        System.out.println("把茶倒进杯子");
//    }
//
//    private void steepTeaBag() {
//        System.out.println("冲泡茶");
//    }
//
//    private void boilWater() {
//        System.out.println("将水煮沸");
//    }
//}

abstract class CaffeinBeverage{
    final void preparePecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    void pourInCup(){
        System.out.println("倒进杯子");
    }

    protected abstract void brew();

    void boilWater(){
        System.out.println("把水煮沸");
    }
}

class Tea extends CaffeinBeverage{

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    protected void brew() {
        System.out.println("茶");

    }
}

class Coffee extends CaffeinBeverage{

    @Override
    protected void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("咖啡");
    }
}
public class Practice2 {
}
