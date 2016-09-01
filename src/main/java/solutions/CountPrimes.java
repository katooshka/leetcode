package solutions;

public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            deleteNonPrimeNumbers(i, notPrime);
        }
        int count = 0;
        for (int i = 2; i < notPrime.length; i++) {
            if (!notPrime[i]) count++;
        }
        return count;
    }

    private void deleteNonPrimeNumbers(int i, boolean[] array) {
        for (int j = i * i; j < array.length; j += i) {
            array[j] = true;
        }
    }

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes(3));
    }
}
