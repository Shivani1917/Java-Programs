class Y{                   //average of marks of 3 subjects of 5 students

    String name;
    int rollno;
    float ijp;
    float evs;
    float softskills;
    float avg;

        void studentrecord(String n, int r, float m1,float m2, float m3 ){

            name=n;
            rollno=r;
            ijp=m1;
            evs=m2;
            softskills=m3;
          
        }

        void printrecord(){
            System.out.println("Student name " +name+ " ,Rollno. " +rollno+ " Marks in IJP: " +
            ijp+ " in E.V.S: " +evs+ " & in Soft Skills: " +
            softskills);
        }
        
        
        void Average(float m1, float m2, float m3) {
            float c;
            c= (m1+m2+m3)/3;
            System.out.println("Average is: " + c);
        }

       

        }

        class X{
            public static void main(String[] args) {
                Y student1= new Y();
                student1.studentrecord("Aryan", 1, 8,9,8);
                student1.printrecord();
                student1.Average(8, 9, 8);

                Y student2= new Y();
                student2.studentrecord("Avin", 2, 6,7,9);
                student2.printrecord();
                student2.Average(6, 7, 9);

                Y student3= new Y();
                student3.studentrecord("Anita", 3,9,9,8);
                student3.printrecord();
                student3.Average(9, 9, 8);

                Y student4= new Y();
                student4.studentrecord("Gyan", 4, 8,6,4);
                student4.printrecord();
                student4.Average(8, 6, 4);

                Y student5= new Y();
                student5.studentrecord("Gunjan", 5, 8,5,8);
                student5.printrecord();
                student5.Average(8, 5, 8);

            }
        }
        
    

