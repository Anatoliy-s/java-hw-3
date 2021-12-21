class ATM {
    public static int countBanknotes(int sum) {
        int result = 0;
        int number;
        int[] banknotes = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;

       while (i<banknotes.length-1) {

           number = banknotes[i];

           result+=sum/number;
           sum = sum % number;
           i++;
        }
         return result;
    }
}
