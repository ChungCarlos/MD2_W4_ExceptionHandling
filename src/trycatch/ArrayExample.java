package trycatch;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    // Tạo phương thức createRandom
    // Trả về mảng số nguyễn ngẫu nhiên từ 0 đến 100.

    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println(" Danh sách phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    // Người dùng nhập vào chỉ số của một phần tử bất kỳ...
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();
        // Tạo ngẫu nhiên 100 số trong arr...

        Scanner sc = new Scanner(System.in);

        // Tìm kiếm giá trị phần tử theo chỉ số đó dựa trên mảng vừa tạo...
        System.out.println("\n Nhập chỉ số của 1 phần từ bất kỳ: ");
        int x = sc.nextInt();
        try{
            System.out.println(" Giá trị của phần tử có chỉ số " + x + " là: " + arr[x]);
        }catch (IndexOutOfBoundsException e){ // Có thể dùng 'catch(Exception e)' tương đương...
            System.out.println("Vượt quá giá trị của mảng");
        }
    }
}
