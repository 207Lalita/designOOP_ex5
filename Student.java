public class Student{
        private final String name;
        private final String university;
        private final int age;

        private Student(StdBuilder stdBuilder){
            this.name =  stdBuilder.name;
            this.university =  stdBuilder.university;
            this.age =  stdBuilder.age;
        }

        public String getName(){
            return name;
        }

        public String getUniversity(){
            return university;
        }

        public int getAge(){
            return age;
        }



    public static class StdBuilder{
        private final String name;
        private final String university;
        private int age;

        private StdBuilder(String name, String university){
            this.name = name;
            this.university = university;
        }

        public StdBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

    public static void main(String[] args) {
        Student std = new Student.StdBuilder("Lalita Boonsuk","KMITL").setAge(20).build();

        System.out.println("Name : " + std.getName());
        System.out.println("University : " + std.getUniversity());
        System.out.println("Age : " + std.getAge());
    }
}

