class Bicycle{
  private String name;
  private String color;
  private int distance;
  
  Bicycle(String name, String color){
    this.name = name;
    this.color = color;
    this.distance = 0;
  }
  
  //インスタンスメソッド
  
  //自転車の情報を出力するメソッド
  public void printData(){
    System.out.println("【自転車の情報】");
    System.out.println("名前: " + this.getName());
    System.out.println("色: " + this.getColor());
    System.out.println("走行距離: " + this.distance + "km");
  }
  
  //走る処理のメソッド
  public void run(int runDistance){
    System.out.println(runDistance + "km走ります");
    this.setDistance(this.getDistance() + runDistance);
    System.out.println("走行距離: " + this.getDistance() + "km");
  }
  
  //nameのアクセサ
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  //colorのアクセサ
  public String getColor(){
    return this.color;
  }
  
  public void setColor(String color){
    this.color = color;
  }
  
  //distanceのアクセサ
  public int getDistance(){
    return this.distance;
  }
  
  public void setDistance(int distance){
    this.distance = distance;
  }
}