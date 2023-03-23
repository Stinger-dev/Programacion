package Boletin_07.Ejercicio_05;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BackendProgrammer extends Candidate {

	public BackendProgrammer(LocalDate dateOfBirth, LocalDateTime startDate, String dni, String name, String surname,
			ContractType ct, boolean inProject) {
		super(dateOfBirth, startDate, dni, name, surname, ct, inProject);
	}

}
