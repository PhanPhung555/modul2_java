public class Timgiatrilonnho {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3, 4}, {-1, 8, 7, 9, 19}};
//        Gán giá trị max , min ở vị trí 0 , phần tử 0
        int max = num[0][0];
        int min = num[0][0];
//        Lắp qua mảng 2 chiều
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
//      Giá Trị Lớn Nhất
                if (max < num[i][j]) {
                    max = num[i][j];
                }
                //      Giá Trị Nhỏ Nhất
                if (min > num[i][j]) {
                    min = num[i][j];
                }
            }
        }
//        In kết quả cho người dùng
        System.out.println("Giá trị lớn nhất : "+ max);
        System.out.println("Giá trị nhỏ nhất : "+min);
    }

}
