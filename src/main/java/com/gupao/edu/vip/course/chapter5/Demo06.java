package com.gupao.edu.vip.course.chapter5;

public class Demo06 {
    public static void main(String[] args) {
        int count = 10;
        int i = 8;
        if(++i > count){
            System.out.println("i >  count ");
        }else {
            System.out.println("i <  count ");
        }
    }
}
/**  public com.gupao.edu.vip.course.chapter5.Demo06();
 descriptor: ()V
 flags: ACC_PUBLIC
 Code:
 stack=1, locals=1, args_size=1
 0: aload_0
 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 4: return
 LineNumberTable:
 line 3: 0
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 0       5     0  this   Lcom/gupao/edu/vip/course/chapter5/Demo06;

 public static void main(java.lang.String[]);
 descriptor: ([Ljava/lang/String;)V
 flags: ACC_PUBLIC, ACC_STATIC
 Code:
 stack=2, locals=3, args_size=1
 0: bipush        10
 2: istore_1
 3: bipush        8
 5: istore_2
 6: iinc          2, 1
 9: iload_2
 10: iload_1
 11: if_icmple     25
 14: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 17: ldc           #3                  // String i >  count
 19: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 22: goto          33
 25: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 28: ldc           #5                  // String i <  count
 30: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 33: return
 LineNumberTable:
 line 5: 0
 line 6: 3
 line 7: 6
 line 8: 14
 line 10: 25
 line 12: 33
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 0      34     0  args   [Ljava/lang/String;
 3      31     1 count   I
 6      28     2     i   I
 StackMapTable: number_of_entries = 2
 frame_type = 253 *//* append *//*
        offset_delta = 25
        locals = [ int, int ]
        frame_type = 7 *//* same *//*
    }
*/
