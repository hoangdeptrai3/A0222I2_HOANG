package ss10_DanhSach.ThucHanh.CreatListEasy;

public class MylistTest{
    public static void main(String[] args) {
        Mylist<Integer> list = new Mylist<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("element 0 =" + list.get(0));
        System.out.println("element 1 =" + list.get(1));
        System.out.println("element 2 =" + list.get(2));
        System.out.println("element 3 =" + list.get(3));
//        list.get(6);
//        System.out.println("element 6: "+list.get(6));

    }
}
