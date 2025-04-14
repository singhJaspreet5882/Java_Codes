public class array02 {
    public static void main(String[] args) {
/*
       int [] marks = {50, 40, 30, 20, 10};
        System.out.println(marks[2]);
        System.out.println(marks.length);
       float [] extra = {10, 10.55f, 20.5f, 30.9f, 49.9f};
        System.out.println(extra[2]);
        System.out.println(extra.length);
        String [] students = {"half mind", "kala pagla", "chutiya", "hown", "matku"};
        System.out.println(students[2]);
        System.out.println(students.length);

        // DISPLAYING ARRAY BY FOR LOOP

        int[] points = {10, 20, 30, 40, 50};

        for (int i =0; i <points.length; i++   ){
            System.out.println(points[i]);
        }

        // DISPLAYING ARRAY IN REVARSE FORM
        int[] points = {10, 20, 30, 40, 50};

        for (int i = points.length-1; i>=0 ; i--){
            System.out.println(points[i]);
        }

        // FOR EACH LOOP
         for (int elements : points){
             System.out.println(elements);*/

             //---------------------------------------------------------------------------------------------------------

        // all methods by use of for loops/ for each loop
        // 1. FLOAT METHOD

        float[] marks = {10.1f, 20.5f, 30.9f, 45.8f, 49.9f};
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        // 2. STRING METHOD

        String[] students = {"ram", "sham", "harry", "jerry", "tom"};
        for (String elements : students){
            System.out.println(elements);
        }

      // revarse form

        int[] ino = {520,147,125,562,3652};
        for (int i = ino.length-1; i >=0; i--){
            System.out.println(ino[i]);
        }













































    }
}
