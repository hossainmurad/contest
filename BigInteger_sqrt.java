public static BigInteger sqrt(BigInteger n) {
	BigInteger a = BigInteger.ONE;
	BigInteger b = n.shiftRight(5).add(BigInteger.valueOf(8));
	while (b.compareTo(a) >= 0) {
		BigInteger mid = a.add(b).shiftRight(1);
		if (mid.multiply(mid).compareTo(n) > 0) {
			b = mid.subtract(BigInteger.ONE);
		} else {
			a = mid.add(BigInteger.ONE);
		}
	}
	return a.subtract(BigInteger.ONE);
     }
