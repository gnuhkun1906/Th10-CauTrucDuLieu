package th1List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger=new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(5);

        System.out.println("elm4 : "+listInterger.get(4));
        System.out.println("elm1 : "+listInterger.get(1));
        System.out.println("elm3 : "+listInterger.get(3));
        listInterger.get(-1);
        System.out.println("elm6 : "+listInterger.get(-1));
    }
}
