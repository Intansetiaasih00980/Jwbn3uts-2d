public class FixErrorCode {
    public class ErrorHandlingExample {
        public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};
                int index = 4;
                int result = numbers[index]; // Mencoba mengakses indeks yang tidak valid

                System.out.println("Hasil: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Terjadi kesalahan: Indeks diluar batas array");
            } finally {
                System.out.println("Program selesai.");
            }
        }
    }
}
