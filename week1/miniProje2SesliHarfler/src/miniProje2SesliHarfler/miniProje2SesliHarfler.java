package miniProje2SesliHarfler;

public class miniProje2SesliHarfler {

	public static void main(String[] args) {
		char harf = 'b';
		switch (harf) {
		case 'A':
		case 'a':
		case 'I':
		case 'ı':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Kalın sesli harf girdiniz");
			break;
		case 'E':
		case 'e':
		case 'İ':
		case 'i':
		case 'Ö':
		case 'ö':
		case 'Ü':
		case 'ü':
			System.out.println("İnce sesli harf girdiniz");
			break;
		default:
			System.out.println("Sesli harf giriniz");

		}

	}

}
