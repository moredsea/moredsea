public class sea {
    int number = 4;
    double num = 3.14;
    String text = "hello";
    char a;
    boolean flag = true;
    int sum(int a, int b){
        return a + b;
    }
void Mes(String message){
        System.out.println(message);
}
}
class App{
int my;
 public static void main(String[] args){
        System.out.println("Hello world");
        sea dog = new sea();
        sea cat = new sea();
        System.out.println("Dog" + dog.number);
        System.out.println("Cat" + cat.number);
    }
    }
class bg5 extends App {
    void su(int my) {
        this.my = my;
    }
}
