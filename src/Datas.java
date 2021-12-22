import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Datas {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println("A data de hoje � " + hoje);
		System.out.println("==========================================================");
		LocalDate olimpiadasParis = LocalDate.of(2024, Month.JUNE, 5);
		System.out.println("As Olimp�adas de Paris ocorrer� em " + olimpiadasParis);
		System.out.println("==========================================================");
		
		// Verificar quanto tempo falta para a pr�xima Olimp�ada
		int anos = olimpiadasParis.getYear() - hoje.getYear();
		System.out.println("Faltam: " + anos + " anos.");
		System.out.println("==========================================================");
		
		// Verificar quantos anos, meses ou dias faltam para a pr�xima Olimp�ada
		Period periodo = Period.between(hoje, olimpiadasParis);
		System.out.println("Faltam: " + periodo.getDays() + " dias.");
		System.out.println("Faltam: " + periodo.getMonths() + " meses.");
		
		System.out.println("==========================================================");
		
		LocalDate proximasOlimpiadas = olimpiadasParis.plusYears(4);
		System.out.println("As pr�ximas Olimp�adas Ocorrer� em " + proximasOlimpiadas);
		
		System.out.println("==========================================================");
		
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("As Olimp�adas de Paris ocorrer� em " + olimpiadasParis.format(formatador));	
		
		System.out.println("==========================================================");
		System.out.println("As Olimp�adas de Paris ocorrer� em " + proximasOlimpiadas.format(formatador));

		System.out.println("==========================================================");
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("A data e a hora de hoje � " + agora.format(formatadorComHoras));
		
		System.out.println("==========================================================");
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println("A hora do intervalo � " + intervalo);
		
		System.out.println("==========================================================");
		LocalDate agora2 = LocalDate.now();
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

		Period periodo2 = Period.between(agora2, dataFutura);
		System.out.println("A data da atividade est� prevista para daqui a " + periodo2.getYears() + " anos.");
		
		
		
	}
}
