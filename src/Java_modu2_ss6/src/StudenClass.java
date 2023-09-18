public class StudenClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Phung");
        s1.setClasses("A02");
        System.out.println(s1.toString());
    }

    static class Student {
        private String name = "john";
        private String classes = "C02";

        public Student() {
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", classes='" + classes + '\'' +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }

        public String getName() {
            return name;
        }

        public String getClasses() {
            return classes;
        }
    }
}
