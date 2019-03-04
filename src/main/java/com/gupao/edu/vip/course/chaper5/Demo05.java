package com.gupao.edu.vip.course.chaper5;

public class Demo05 {
    public static void main(String[] args) {

    }
    //锁当前对象
    public synchronized void f1(){

    }
    //锁当前对象
    public  void f2(){
           synchronized (this){

           }
    }
}
/**
public com.gupao.edu.vip.course.chaper5.Demo05();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=1, args_size=1
        0: aload_0
        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
        4: return
        LineNumberTable:
        line 7: 0
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       5     0  this   Lcom/gupao/edu/vip/course/chaper5/Demo05;

public static void main(java.lang.String[]);
        descriptor: ([Ljava/lang/String;)V
        flags: ACC_PUBLIC, ACC_STATIC
        Code:
        stack=0, locals=1, args_size=1
        0: return
        LineNumberTable:
        line 11: 0
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       1     0  args   [Ljava/lang/String;

public synchronized void f1();
        descriptor: ()V
        flags: ACC_PUBLIC, ACC_SYNCHRONIZED
        Code:
        stack=0, locals=1, args_size=1
        0: return
        LineNumberTable:
        line 15: 0
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       1     0  this   Lcom/gupao/edu/vip/course/chaper5/Demo05;

public void f2();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=2, locals=3, args_size=1
        0: aload_0
        1: dup
        2: astore_1
        3: monitorenter  //monitor enter 加锁
        4: aload_1
        5: monitorexit  //monitor exit 释放锁
        6: goto          14
        9: astore_2
        10: aload_1
        11: monitorexit
        12: aload_2
        13: athrow
        14: return
        Exception table:
        from    to  target type
        4     6     9   any
        9    12     9   any
        LineNumberTable:
        line 18: 0
        line 20: 4
        line 21: 14
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0      15     0  this   Lcom/gupao/edu/vip/course/chaper5/Demo05;
        StackMapTable: number_of_entries = 2
        frame_type = 255 *//* full_frame *//*
        offset_delta = 9
        locals = [ class com/gupao/edu/vip/course/chaper5/Demo05, class java/lang/Object ]
        stack = [ class java/lang/Throwable ]
        frame_type = 250 *//* chop *//*
        offset_delta = 4
        }*/
