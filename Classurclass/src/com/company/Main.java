package com.company;

public class Main {

    public static void main(String[] args) {
        // format  статический и служит для форматирования строк
        // %d - для подстановки целых чисел
        // %s - для подстановки строки
        // %f - для подстановки вещественных чисел
        // %с - для подстановки одного символа
        // %b - для подстановки boolean значение (в строку подставит либо "true" либо "false"
        // %% - вывод символа процента
        String name = "Vasya";
        int i = 15;
	String s = String.format("My name is %s. I'm %d years old",name, i);
	System.out.println(s);
	System.out.println(String.format("%10s, %12d","1234567891011",5));

	for(int k = 2; k <= 9; k++) {
	    for (int j =2; j <=9; j++){
	        System.out.print(String.format("%d*%d=%2d ",k,j,k*j));
        }
	    System.out.println();
    }
	//\n - переход на новую строку
    //\t  - табуляция
    // \b - удаляет предыдущий символ
    System.out.println(String.format("Hello\n\n\n\nworld\t!!1\b!"));
    }
}
