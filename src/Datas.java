import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Datas {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println("A data de hoje é " + hoje);
		System.out.println("==========================================================");
		LocalDate olimpiadasParis = LocalDate.of(2024, Month.JUNE, 5);
		System.out.println("As Olimpíadas de Paris ocorrerá em " + olimpiadasParis);
		System.out.println("==========================================================");
		
		// Verificar quanto tempo falta para a próxima Olimpíada
		int anos = olimpiadasParis.getYear() - hoje.getYear();
		System.out.println("Faltam: " + anos + " anos.");
		System.out.println("==========================================================");
		
		// Verificar quantos anos, meses ou dias faltam para a próxima Olimpíada
		Period periodo = Period.between(hoje, olimpiadasParis);
		System.out.println("Faltam: " + periodo.getDays() + " dias.");
		System.out.println("Faltam: " + periodo.getMonths() + " meses.");
		
		System.out.println("==========================================================");
		
		LocalDate proximasOlimpiadas = olimpiadasParis.plusYears(4);
		System.out.println("As próximas Olimpíadas Ocorrerá em " + proximasOlimpiadas);
		
		System.out.println("==========================================================");
		
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("As Olimpíadas de Paris ocorrerá em " + olimpiadasParis.format(formatador));	
		
		System.out.println("==========================================================");
		System.out.println("As Olimpíadas de Paris ocorrerá em " + proximasOlimpiadas.format(formatador));

		System.out.println("==========================================================");
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("A data e a hora de hoje é " + agora.format(formatadorComHoras));
		
		System.out.println("==========================================================");
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println("A hora do intervalo é " + intervalo);
		
		System.out.println("==========================================================");
		LocalDate agora2 = LocalDate.now();
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

		Period periodo2 = Period.between(agora2, dataFutura);
		System.out.println("A data da atividade está prevista para daqui a " + periodo2.getYears() + " anos.");
		
		
		
	}
}
