public class Studen {
    public static void main(String[] args) {
        Test test = new Test();
//        Public và protected (Mang tính bảo vệ), default
//        test.setClasses("Co6");

//       privert lỗi
//        test.setName("Jony");



    }

    public static class Test {
        private String name = "Jone";
        private String classes = "C02";

        public Test() {
        }

        public Test(String name, String classes) {
            this.name = name;
            this.classes = classes;
        }
    //      PRIVATE
    //    private void setName(String name) {
    //        this.name = name;
    //    }
    //    private void setClasses(String classes) {
    //        this.classes = classes;
    //    }


    //    PROTECTED
    //    protected void setName(String name) {
    //        this.name = name;
    //    }
    //    protected void setClasses(String classes) {
    //        this.classes = classes;
    //    }


    //    Default
    //     void setName(String name) {
    //        this.name = name;
    //    }
    //     void setClasses(String classes) {
    //        this.classes = classes;
    //    }


        //    PUBLIC
        public void setName(String name) {
            this.name = name;
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }
    }
}
