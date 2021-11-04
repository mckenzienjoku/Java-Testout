public class Main {
    public static void main(String[] args) {
            System.out.println("Hello World");
            String name= "Stefan";
            System.out.println(name);
            int Num= 15;
            System.out.println(Num);
            float Decimal= 5.3f;
            System.out.println(Decimal);
            System.out.println(name + " scored "+ Decimal + " out " + "of " + Num);
            String firstName= "Charles";
            String lastName= " Darwin";       
            System.out.println("His " + "name "+ "was " + firstName + lastName); 
            int x= 5;
            int y= 10;
            int z= x;
            System.out.println(x + y + z);
            char grade= 'A';
            System.out.println("He " + "got " + "an " + grade + " in " + "his " + "final " + "exams." );
            int newNumber= 10;
            double newDouble= newNumber;
            System.out.println(newDouble + newNumber);
            double myDouble= 9.25;
            int myInt= (int) myDouble;  // integers do not take decimal numbers, so it will only take the whole number value which is 9.
            System.out.println(myInt + myDouble);
            int x2= 100 + 50;   // I did not use x because x has already been taken.
            System.out.println(x2);
            int x3= x + x2;
            System.out.println(x3);
            int newMod= 50 % 3; // Modulus just takes the remainder of an operation (even 0) ONLY and leaves forgets about the actual product of the operation
            int x4= newMod + x3;
            System.out.println(newMod);
            System.out.println(x4 + newMod);
            int x5= ++x4;
            int x6= --x5;
            System.out.println(x5);
            System.out.println(x6);
            System.out.println(x5 + x6);
            int x7= x6+= 5;
            System.out.print(x7);
            String txt= "qwertyuioplkjhgfdsazxcvbnm";
            System.out.println("The length of the txt string is: " + txt.length());
            System.out.println(txt.toUpperCase());
            int a= 20;
            a*= 5;
            System.out.println(a);
            String sing= "Alleluia";
            String song= "Glory be to God ";
            System.out.println(song + "Amen and " + sing);  // The addition sign will be used to join the two strings together
            System.out.println(song + "" + sing);   // The "" is used to make a space between the two strings
            System.out.println(song .concat(sing)); // You can also use the .concat variable to separate two strings if you do not want to use an addition sign.
            String valHalla= "Yes, we met them \"Vikings\" back in the 800's.";
            System.out.println(valHalla);
            String relax= "It's alright.";
            System.out.println(relax);
            String begining= "Hello \nWorld";
            System.out.println(begining);
            System.out.println(Math.min(a, x));
            System.out.println(Math.sqrt(64));
            System.out.println(Math.abs(-200));
            System.out.println(Math.random());
            int randomNum= (int)(Math.random()*101);
            System.out.println(randomNum);
            
    }
}