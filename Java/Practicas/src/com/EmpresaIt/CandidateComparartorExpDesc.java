package com.EmpresaIt;

import java.util.Comparator;

public class CandidateComparartorExpDesc implements Comparator<Candidate> {

	@Override
	public int compare(Candidate ob1, Candidate ob2) {
		int resultado = 0;
		
		if (ob1 != null && ob2 != null) {
			resultado = ob2.getStartDate().compareTo(ob1.getStartDate());
		} else if (ob2 == null) {
			resultado = 1;
		} else if (ob1 == null) {
			resultado = -1;
		}
		return resultado;
	}

}
