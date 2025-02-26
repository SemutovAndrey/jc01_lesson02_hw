package com.edu.les02.main;

public class Volume {

	public static void main(String[] args) {
		double n = 5; //колличество малых бидонов;
		double m = 8; //колличество больших бидонов;
		double Vmb = 80 / n; //литров молока в 1 малом бидоне
		double Vbb = 80 / n + 12; //литров молока в 1 большом бидоне
		double Vmbb = (80 / n + 12) * m; //литров молока в m больших бидонах
		System.out.println(Vmbb); //Выводим искомое значение 
	}

}
