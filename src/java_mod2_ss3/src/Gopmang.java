public class Gopmang {
    public static void main(String[] args) {
        int[] number = {1, 29, 3, 4, 5};
        int[] number1 = {2, 3, 4, 5, 6};
        int[] num3 = new int[number.length + number1.length];
        int pos = 0;
//        Cach 1
        System.arraycopy(number, 0, num3, 0, number.length);
        System.arraycopy(number1, 0, num3, number.length, number1.length);

//        Cach 2
        for(int i : number){
            num3[pos] = i;
            pos++;
        }
        for(int j : number1){
            num3[pos] = j;
            pos++;
        }

//       Cach 3
        for (int i = 0; i < number.length; i++) {
            num3[pos] = number[i];
            pos++;
        }
        for (int i = 0; i < number1.length; i++) {
            num3[pos] = number1[i];
            pos++;
        }
//        In ket qua
        for (int i : num3) {
            System.out.print(i + "\t");
        }

    }
}
