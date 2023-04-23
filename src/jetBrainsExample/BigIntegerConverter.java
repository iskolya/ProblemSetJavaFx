package jetBrainsExample;

class BigIntegerConverter {

    /**
     * @param number string representing the number
     * @return BigInteger instance
     */
    public static Number getBigInteger(String number) {
        int a = Integer.parseInt(number);
        a *=200;
        return a;
    }
}
