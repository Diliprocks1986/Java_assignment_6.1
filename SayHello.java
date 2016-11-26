import java.util.Timer;
import java.util.TimerTask;

class SayHello extends TimerTask {
	//run method
    public void run() {
       System.out.println("Hello World!"); 
    }
public static void main(String []args){
	//timer Object 
 Timer timer = new Timer();
 // timer will print hello world in every 3 seceond
 timer.schedule(new SayHello(), 0, 3000);
}
}