public class Main {
    public static void main(String[] args) {
        //[Bài tập] Thêm phần tử vào mảng
        int[] array = {1, 2, 3, 4, 5, 6};
        int X = 10;
        int index = 2;
        int a[] =  Add(array,X,index);
        for(int i : a) {
            System.out.println(i);
        }

    }
    public static int []Add(int []a,int value,int index) {
        int []rs = new int[a.length + 1];
        for(int i = a.length; i >= index; i--) {
            rs[i] = a[i-1];
        }
        for(int i = index;i >=0 ;i--)
        {
            rs[i]  = a[i];
        }
        rs[index] = value;
        return rs;
    }
}
