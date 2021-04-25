import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //自転車に関する情報
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int bicycleDistance = scanner.nextInt();
    bicycle.run(bicycleDistance);
    
    //車に関する情報
    System.out.println("=================");
    Car car = new Car("フェラーリ", "赤");
    car.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    int carDistance = scanner.nextInt();
    car.run(carDistance);
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int refuel = scanner.nextInt();
    car.charge(refuel);
  }
}