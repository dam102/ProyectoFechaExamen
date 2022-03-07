package examen;
/**
 * 
 * @author DAM102
 * @version 1.0
 */
public class Fecha {
	public static boolean fechaValida;
	/**
	 * 
	 * @param anio Se indica un parametro de año
	 * @param mes Se indica un parametro de mes
	 * @param dia Se indica un parametro de dia
	 * @return fechaValida Devuelve si la fecha es valida en las condiciones
	 */
	public static boolean validarFecha(int anio,int mes,int dia) {
		fechaValida = false;
		/**
		 * Condiciones sobre los parametros para devolver el booleano de fechaValida
		 * Con True o False
		 */
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		/**
		 * Devuelve el valor fechaValida
		 */
		return fechaValida;
	}
}