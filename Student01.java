class Student {
    String name = "sato";
    public void calculateAvg(int math, int english) {
    System.out.println((math + english)/2);
    }
}

public class Student01{
    public static void main(String[] args) {
        // インスタンス化(クラス名、オブジェクト名)
    Student a001 = new Student();
    // オプジェクト.フィールド名
    a001.name = "sato";

    System.out.println(a001.name);
    a001.calculateAvg(90,80);

    Student a002 = new Student();
    a002.name = "suzuki";
    System.out.println(a002.name);


}
    
}

        

