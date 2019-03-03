package com.gupao.edu.vip.course.chaper2;

public class Test1 {
	public static void main(String args) {
		int a=2;
		int b=400;
		int c = a + b;
		System.out.println(c);
	}
	/***
	 public static void main(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      # stack=2：操作数栈的深度为 2
      # 本地变量表最大长度（slot为单位），64位的是2，其他是1，索引从0开始，如果是非static方法索引0代表this，后面是入参，后面是本地变量
      # 1个参数，实例方法多一个this参数
      stack=2, locals=4, args_size=1
         0: iconst_2  #常量2压栈
         1: istore_1  #常量2出栈保存到本地变量1里面
         2: iconst_3  #常量3压栈
         3: istore_2  #常量3出栈保存到本地变量2里面
         4: iload_1    #局部变量1 即a 压栈
         5: iload_2    #局部变量2 即b 压栈
         6: iadd        # 栈顶两个元素相加，计算结果压栈
         7: istore_3  # 计算结果出栈保存到局部变量3里面
         8: getstatic     #16 // Field java/lang/System.out:Ljava/io/PrintStream; 类方法
        11: iload_3		#变量3 即c 压栈
        12: invokevirtual #22 // Method java/io/PrintStream.println:(I)V 实例方法
        15: return
      LineNumberTable:  //行号表：行号 对应 槽位
        line 5: 0
        line 6: 2
        line 7: 4
        line 8: 8
        line 9: 15
      LocalVariableTable:  //本地变量表，slot表示槽位
        Start  Length  Slot  Name         Signature(签名即类型)
            0      16     0  args         Ljava/lang/String;
            2      14     1  a(1号变量)   I
            4      12     2  b(2号变量)   I
            8       8     3  c(3号变量)   I
	 **/
}
