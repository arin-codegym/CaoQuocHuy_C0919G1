package Algorithm;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        /*
        1. Convert the input string into character array by using the toCharArray() built in method of the String Class .
2. In this method we will scan the character array from both sides , that is from the start index (left) as well as from last index(right) simultaneously.
3. Set the left index equal to 0 and right index equal to the length of the string -1.
4. Swap the characters of the start index scanning with the last index scanning  one by one .After that  increase the left index by 1 (left++) and decrease the right by 1 i.e (right--) to move on to the next characters in the character array .
5. Continue till left is less than or equal to the right .
        * */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] tempArray = input.toCharArray();
        int left, right = 0;
        // String string="";
        right = tempArray.length - 1;
        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }
//        for (char c : tempArray)
//            System.out.print(c);
        System.out.println();
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
        System.out.println(toggle(input));
//        for (int i = 0; i < tempArray.length; i++) {
//            char character = tempArray[i];
//            if (Character.isUpperCase(input.charAt(i))) {
//                character = Character.toLowerCase(input.charAt(i));
//            } else {
//                character = Character.toUpperCase(input.charAt(i));
//            }
//
//            input+= character;
//        }


    }
    public static String toggle(String s) {
        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char charat = ch[i];
            if (Character.isUpperCase(charat)) {
                charat = Character.toLowerCase(charat);
            } else
                charat = Character.toUpperCase(charat);
            System.out.print(charat);
        }
        return s;
    }
    /*
    1. The last method is converting string into bytes .  getBytes()  method  is used to convert the input string into bytes[].
2. Then we will create a temporary byte[]  of length equal to the length of the input string.
3. We will store the bytes(which we get by using getBytes() method) in reverse order   into the temporary byte[] .
    public static void main(String[] args) {
       String input = "Be in present";
       byte [] strAsByteArray = input.getBytes();
       byte [] result = new byte [strAsByteArray.length];

       for(int i = 0; i < strAsByteArray.length; i++){
           result[i] = strAsByteArray[strAsByteArray.length-i-1];
       }
       System.out.println( new String(result));

   }*/
    /*
    public static void main(String[] args) {
        String input="";
        System.out.println("Enter the input string");
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            char[] try1= input.toCharArray();
            for (int i=try1.length-1;i>=0;i--)
            System.out.print(try1[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
    */
    /*
     public static void main(String[] args) {
     String input="AliveisAwesome";
     StringBuilder input1 = new StringBuilder();
     input1.append(input);
     input1=input1.reverse();
     for (int i=0; i < input1.length(); i++)
     System.out.print(input1.charAt(i));
  }
    * */
    //public static void main(String[] args) {
    //     String input = "Be in present";
    //     char[] hello=input.toCharArray();
    //     List trial1= new LinkedList<>();
    //     for(char c: hello)
    //         trial1.add(c);
    //     Collections.reverse(trial1);
    //     ListIterator li = trial1.listIterator();
    //     while(li.hasNext()) {
    //        System.out.print(li.next());
    //     }
    //   }
    //
    /*
    *   public static void main(String[] args){
      String string="abcdef";
      String reverse = new StringBuffer(string).
      reverse().toString();
      System.out.println("\nString before reverse:
      "+string);
      System.out.println("String after reverse:
      "+reverse);
   }
    * */
}
