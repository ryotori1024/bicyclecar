class Car{
  private String name;
  private String color;
  private int distance;
  private int fuel;
  
  Car(String name, String color){
    this.name = name;
    this.color = color;
    this.distance = 0;
    this.fuel = 100;
  }
  
  //インスタンスメソッド
  
  //車の情報を出力するメソッド
  public void printData(){
    System.out.println("【車の情報】");
    System.out.println("名前: " + this.getName());
    System.out.println("色: " + this.getColor());
    System.out.println("走行距離: " + this.getDistance() + "km");
    System.out.println("ガソリン量: " + this.getFuel() + "L");
  }
  
  //走る処理のメソッド
  public void run(int runDistance){
    System.out.println(runDistance + "km走ります");
    if(runDistance <= this.getFuel()){
      this.setDistance(this.getDistance() + runDistance);
      this.setFuel(this.getFuel() - runDistance);
    }else{
      System.out.println("ガソリンが足りません");
    }
    System.out.println("走行距離: " + this.getDistance() + "km");
    System.out.println("ガソリン量: " + this.getFuel() + "L");
  }
  
  //給油するメソッド
  public void charge(int refuel){
    System.out.println(refuel + "L給油します");
    if(refuel <= 0){
      System.out.println("給油できません");
    }else if(refuel + this.getFuel() >= 100){
      System.out.println("満タンまで給油します");
      this.setFuel(100);
    }else{
      this.setFuel(getFuel() + refuel);
    }
    System.out.println("ガソリン量:" + this.getFuel() + "L");
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

  //fuelのアクセサ
  public int getFuel(){
    return this.fuel;
  }
  
  public void setFuel(int fuel){
    this.fuel = fuel;
  }
}