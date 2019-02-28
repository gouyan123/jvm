package com.gupao.edu.vip.course.chaper2;

public class TryFinally {
	public static void main(String[] args) {
		System.out.println(f1());
	}
	/**
	 public static java.lang.String f1();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=3, args_size=0
         0: ldc #34  // String Hello  //去常量池 加载 常量 "Hello"
         2: astore_0  //存到 0号变量 str
         3: aload_0  //把 0号变量 str 入栈
         4: astore_2  //存到 2号变量 str
         5: ldc #36  // String gupao  //去常量池 加载 常量 "gupao"
         7: astore_0  //存到 0号变量 str
         8: aload_2  //把 2号变量 str 入栈
         9: areturn  //返回 2号变量 str
        10: astore_1
        11: ldc #36  // String gupao  //去常量池 加载 常量 "gupao"
        13: astore_0  //存到 0号变量 str
        14: aload_1
        15: athrow
	 * */
	public static String f1() {
		String str = "hello";
        try{
            return str;
        }
        finally{
            str = "gupao";
        }
	}
}
