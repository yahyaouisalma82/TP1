import java.rmi.Naming;
public class Client implements java.io.Serializable {
 private Client() {}
 public static void main(String[] args) {
 String host = (args.length < 1) ? null : args[0];
 try {
 //HelloDistant objDistant = (HelloDistant) // Create an remote object with the same name
 
 IHello stub = (IHello) 
 Naming.lookup("rmi://localhost/MyHelloSercive");
 String response = stub.sayHello();
 System.out.println("response: " + response);
 } catch (Exception e) {
 System.err.println("Client exception: " + e.toString());
 e.printStackTrace();}}}
