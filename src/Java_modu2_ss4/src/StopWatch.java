public class StopWatch {
    public static void main(String[] args) {


        Stop stopnum = new Stop();
//        thời gian ban đầu
        long Star = stopnum.getStarTime();
        System.out.println("StarTime : " + Star);

//        Khai báo độ dài mảng
        int[] numsix = new int[10000];
        int pow = 0;
        for (int j : numsix) {
//            random số ngẫu nhiên
            int a = (int) Math.round(Math.random() * 100);
//            thêm số random vào mảng
            numsix[pow] += a;
            pow++;
        }
//        Xắp xếp mảng vừa random từ nhỏ đến lớn (thuật toán xắp xếp )
        int leng = numsix.length;
        for (int i = 0; i < leng; i++) {
            for (int j = 0; j < leng - 1 - i; j++) {
                if (numsix[j] > numsix[j + 1]) {
                    int temp = numsix[j];
                    numsix[j] = numsix[j + 1];
                    numsix[j + 1] = temp;
                }
            }
        }
//        thời gian kết thúc
        long End = stopnum.getEndTime();
        System.out.println("EndTime : " + End);
//         in ra thời gian
        System.out.println("KQ " + stopnum.getElapsedTime() + "ms");


    }

    //      CLASS
    public static class Stop {
        private long starTime;
        private long endTime;

        public Stop() {
        }

        //   Contructor
        public Stop(long starTime, long endTime) {
            this.starTime = starTime;
            this.endTime = endTime;
        }

        //     Getter

        public long getStarTime() {
            return starTime = System.currentTimeMillis();
        }

        public long getEndTime() {
            return endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return this.endTime - this.starTime;
        }

        ;


    }
}
