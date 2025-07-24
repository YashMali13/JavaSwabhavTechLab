package com.aurionpro.text;

import com.aurionpro.model.TraficSignal;

public class TraficLigth_01 {
public static void main(String[] args) {
	for(TraficSignal signal : TraficSignal.values()) {
		System.out.println(signal+" -> "+ signal.getAction());
	}
}
}
