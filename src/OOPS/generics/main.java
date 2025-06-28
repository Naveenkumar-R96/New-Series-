package OOPS.generics;

public class main {
    public static void main(String[] args) {
      normal obj1=new normal();
      obj1.a=1;
      obj1.b=2;
      obj1.func();


      normal obj2=new normal();
      obj2.func();

      generics<Integer> gen1=new generics<>();
      generics<String> gen2=new generics<>();

      gen1.put(2);
      gen1.getting();
      gen1.arr.add(5);
      gen1.arr.add(45);

      gen2.put("naveen");
      gen2.getting();




    }
}
