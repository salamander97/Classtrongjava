public class Person {
    public  String name;
    public  int age;
    public double height;
//Kiểu dữ liệu trả về(void,int,string)
//Nếu là void thì không cần trả về kết quả gì
    public  void eat(String foodName){
        System.out.println(name+" is eating "+foodName);
    }
//Nếu là int string,... thì cần phải trả về kết quả tuỳ thuộc kiểu dữ liệu ban đầu
    public  int getAge(){
        return age;
    }
}
