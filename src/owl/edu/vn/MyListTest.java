package owl.edu.vn;

public class MyListTest {

    public static void main(String[] args) {

        // Tạo một đối tượng MyList mới
        MyList<Integer> myList = new MyList<Integer>();

        // Thêm phần tử vào danh sách
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        // In ra số lượng phần tử trong danh sách
        System.out.println("Size of myList: " + myList.size());

        // Lấy phần tử tại vị trí 2
        System.out.println("Element at index 2: " + myList.get(2));

        // Xóa phần tử tại vị trí 3
        myList.remove(3);

        // In ra danh sách sau khi xóa phần tử
        System.out.println("myList after removing element at index 3: " + myList);

        // Kiểm tra sự tồn tại của phần tử có giá trị bằng 5
        System.out.println("Does myList contain element with value 5? " + myList.contains(5));

        /*
        // Xóa tất cả phần tử trong danh sách
        myList.clear();

        // In ra danh sách sau khi xóa tất cả phần tử
        System.out.println("myList after clearing all elements: " + myList);
        */


        // Clone myList1 to myList2
        MyList<Integer> myList2 = myList.clone();

        // Print out myList1 and myList2
        System.out.println("list1: " + myList); // [1, 2, 3, 4]
        System.out.println("list2: " + myList2); // [1, 2, 3, 4]
        System.out.println("list1 == list2: " + (myList == myList2)); // false

    }
}
