package logicOperators;

public class Exercise {
	
	public static void main (String[] args) {
		//Enrique, Paola y Mariana se dirigen a la MacStore y deciden comprar un iphone 15 cada uno. La tienda tiene una promoción por el mes patrio: "Si el total de tu compra supera los 25 mil pesos, obten un 10% de descuento". Enrique, Paola y Mariana deciden comprar los tres equipos con una sola tarjeta. Al llegar a caja, la cajera les menciona que la tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo tanto, deciden pagar con la TDC de Mariana. ¿Cuál sería el costo total por los 3 equipos sin descuento? ¿Aplicaría el descuento en su compra? ¿Cuál sería el costo total con el descuento aplicado? ¿Cuánto pagarían mensualmente?

		
		System.out.println("Enrique, Paola y Mariana se dirigen a la MacStore y deciden comprar un iphone 15 cada uno.");
		
		//Defino el precio de cada iphone individualmente
		float precioIphone = 19499f;
		System.out.println("El precio de cada iPhone 15 es de $" + precioIphone);
		
		//Calculo el precio de 3 iPhones juntos
		float subtotalCompra = precioIphone * 3;
		System.out.println("El precio de tres iPhone 15 es de $" + subtotalCompra);
        
		System.out.println("PROMOCIÓN POR EL MES PATRIO. Si el total de tu compra supera los 25 mil pesos, obten un 10% de descuento.");
		
		//Imprimo si cumple con el descuento y cuánto sería de descuento
		String mensajeDescuento = verificarDescuento(subtotalCompra);
        System.out.println(mensajeDescuento);
        
        // Calculo el total con descuento
        float totalCostoDescuento = subtotalCompra * 0.9f;
        
        // Calculo el costo mensual en 12 MSI
        float compraMsi = totalCostoDescuento / 12;
        System.out.println("Su compra aplica para una promoción de 12 MSI, usted pagaría $" + compraMsi + " cada mes." );
        
    }

		
		public static String verificarDescuento(float subtotalCompra) {
			if (subtotalCompra > 25000) {
				float totalDescuento = subtotalCompra * .9f;
				return "Felicidades, el descuento de 10% ha sido aprobado por su monto de compra. El total de su compra es $" + totalDescuento;
			}else {
				return "Lo siento, su compra no tiene descuento.";
			}
		}
		

		

		
		
	}


